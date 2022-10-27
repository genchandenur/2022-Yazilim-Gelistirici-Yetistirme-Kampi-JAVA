-- https://www.youtube.com/watch?v=r_pbdopB4LU&list=PLqG356ExoxZVN7rC0KmMo0lvECK97VRZg&index=6
-- Select * from Customers -- customers tablosundaki tüm satırları al 
-- alt satır çalıştığında memoryde fake bir tablo oluşur ve bize onu gösterir.
-- Bu alttaki satır bir tablodur ileride sorguya da select atıcaz.
Select ContactName, CompanyName, City from Customers -- seçtiğim column'lar geldi

-- Select sorgusunda column isimlerine alias atayarak da getirebilirim.
Select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers -- seçtiğim column'lara alias'ları atadı ve öyle gösterdi.

-- filtreleme
-- Şu anki yazdığımız kod Sql server ama kod Oracle, Postgre ve MySql'de de çalışır
-- Bunlar ANSII standardı.
-- Metinler ANSII standardında tek tırnak ile yazılır.
Select * from Customers where City = 'London'

-- SQL Case insensitive'dir. sElEcT'bile yazsan çalışır.
-- bir e-ticaret sitesinde kategoriye tıkladığımızda kodumuzu c#'ta yazdıysak 
-- c# kodumuzun içerisinde şöyle bir kod çalışıyor.
select * from products where CategoryID = 1

-- Aynı şekilde bir e-ticaret sitesinde farklı kategorideki ürünleri listelemek 
-- isteyebiliriz bunun için de arkada böyle bir sorgu çalışır.
select * from products where CategoryId = 1 or CategoryId = 3


-- operatorler
-- <> 10'dan farklı olanları getir = 10'a eşit 
-- > büyüktür >= büyük eşittir
-- < küçüktür <= küçük eşittir.
select * from products where CategoryId = 1 and UnitPrice >= 10

-- select * from products where CategoryId = 1 bu kısmı seçip çalıştırdığımda 12 rows gelir.
--select * from products where CategoryId = 1 and UnitPrice >= 10 bu kısmı seçip çalıştırdığımda 10 rows gelir.


-- Sadece belli sorguyu çalıştırmak istiyorsam
-- Çalıştırmak istediğim sorguyu seçip execute diyebilirim.
-- intellisense'den faydalan kodları yazarken IDE sana yazarken yardımcı olur.

-- Yine e-ticaret sitelerinde fiyata göre artan fiyata göre azalan filtrelerini
-- bu yöntem ile yapabiliriz.
-- tüm ürünleri seç fakat ProductName'e göre sırala.
select * from Products order by ProductName

Select * from Products order by CategoryID

-- CategoryID'ye göre sıraladığım tablomun kategorilerini de kendi içinde ProductName'e
-- göre sıralamak istersem aşağıdaki gibi bir sorgu yazarım.
Select * from Products order by CategoryID, ProductName


-- Fiyata göre sıralamak istersem aşağıdaki gibi bir sorgu yazarım 
-- Aşağıdaki sorgu çalıştıgında ürünleri en ucuzdan pahalıya sıralayarak tabloyu getirir.
Select * from Products order by UnitPrice asc -- asc = ascending (artan) Default'tur. Artana göre sıralar.

Select * from Products order by UnitPrice desc -- desc = descending (azalan) Azalana göre sıralar.

-- CategoryId'si 1 olan ürünleri filtrele ve fiyatlarını azalana göre döndür.
Select * from Products where CategoryId = 1 order by UnitPrice desc


-- count ile Products tablosunda kaç data var bunu döndürür.
-- bu sorgu tek bir sayı döndürdüğünden tek bir row ve column'dan oluşan bir tablo döndürür.
Select count(*) from Products


-- 2 numaralı kategoride kaç tane ürünümüz olduğunu göstermek için
-- aşağıdaki gibi bir sorgu yazarız.
Select count(*) from Products where CategoryID=2

-- Böyle bir sorguda da alias kullanabilirim. count yerine Adet yazar ve tablo oluşturur.
Select count(*) Adet from Products where CategoryID=2


-- hangi kategoride kaç farklı ürünümüz var
-- group by kullandığımızda select ettiğimiz column sadece group by'da yazdığımız alan olabilir.
-- ve kümülatif datalar olabilir.
-- Bütün kategorileri tekrar etmeyecek şekilde bana listele demek.
-- bir group by yaptığımız zaman her bir grup için arka planda bir tablo oluşturuluyor 
-- gibi düşünebiliriz. 
select CategoryID from Products group by CategoryID

-- Dolayısıyla burda count(*) diyebiliriz artık bu da her grup için sayıyı verir
select CategoryID,count(*) Adet from Products group by CategoryID

-- 2 column için de yapabilirim aşağıdaki gibi. Karar destek sistemlerinde çokça kullanılır.
select CategoryID,ProductID,count(*) Adet from Products group by CategoryID, ProductID

-- Karar destek sistemlerinde şöyle bir bilgiyi görmek isteyebiliriz.
-- Ürün sayısı 10'dan az olan kategorileri listele dediğimde burdaki where koşulunu kümülatif dataya yazıcam
-- Group by metodunda kümülatif dataya yazılan koşul having olarak yazılır  
select CategoryID,count(*) Adet from Products group by CategoryID having count(*) < 10 

-- having group by'a konu olan kümülatif sorguya yazılır. 
-- count(*) sayısını verir
-- avg(*) ortalamasını verir.
-- sum(*) toplamını verir.


-- yukarıdaki örnekte datayı filtrelemek istersek where kullanabiliriz
-- aşağıdaki gibi bir sorguda önce her zaman where çalışır.
-- having'i kümülatiflere uygularız.
-- Aşağıdaki sorgunun açıklaması
-- (UnitPrice'ı 20'den fazla olan Product'ları CategoryId'ye göre grupla 
-- o gruplardandan da sayısı 10'dan az olanları göster)
select CategoryID,count(*) Adet from Products where UnitPrice > 20 
group by CategoryID having count(*) < 10 


-- son kullanıcıya id bilgisi değil name bilgisi taşımak daha doğru
-- ürünlerle birlikte kategorileri de getirmek istiyorum. Aşağıdaki gibi yazarım
-- Select * from Products inner join Categories
-- Bu ikisini bir araya neye göre getirmek istiyorum/ nasıl birleştiricem bu durumu da on olarak belirtirim


-- ayrıca * dediğim için ürünle ilgili herşeyi getirir.
Select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID


Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID = Categories.CategoryID

-- DTO - Data Transformation Object : A data transfer object (DTO) is an object that carries data between 
-- processes. You can use this technique to facilitate communication between 
-- two systems (like an API and your server) without potentially exposing sensitive information.


-- Ürünlerden fiyatı 10'dan büyük olanlar için onu kategorilerle join et ve getir.
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories on 
Products.CategoryID = Categories.CategoryID where Products.UnitPrice > 10


-- inner join sadece 2 tabloda birbirleriyle eşleşenleri getirir, eşleşmeyen data varsa onu getirmez.
-- Bu noktada 

-- order details'ın köşeli parantez ile gelmesinin sebebi isimlendirmede
-- boşluk olması ve bunun isimlendirme standardırna uymamasıdır.
-- genelde joinlerde alias kullanılır ve bu alias genelde tablo adına 
-- verilen bir kısaltma olarak karşımıza çıkar.
Select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID
-- 2155 tane sipariş detayı var. Dolayısıyla her bir sipariş detayında da ProductId oldugu için öyle getirdi.

-- Select * from [Order Details]


-- Hiç satış yapamadığımız ürünler nelerdir görmek istersek
-- yazıma göre solda olup sağda olmayanları da getir
-- Bu kod için ne demek ürünler tablosunda var ama satışı yok 
Select * from Products p left join [Order Details] od on p.ProductID = od.ProductID


-- 830 satır geldi. Detayın çok gelmesinin sebebi her siparişte 1'den fazla ürün olması.
-- Eşleşenler geldi inner'la birlikte 
select * from Customers c inner join Orders o on c.CustomerID = o.CustomerID

-- 832 satır geldi. Bunun ne demek müşterilerde olup siparişte olmayanları da yani
-- yani hem inner join olanları hem de siparişte olmayanları da getir
-- genelde getirdiği tabloda en alttaki veriler olur.
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID


-- Sisteme kayıt olmuş ama bizden ürün almamış kişileri görmek istersek. (Kampanya yapmak, aktif müşteri haline getirmek)
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null
-- burdaki null bizim siparişlerde gelmeyen datamız join olan ama boş gelen veriler null olarak geliyor.
-- where primary key'e uygulanır. Aksi takdirde zaten veri null oldugu için de gelebilir. 
-- PK null olamayacağı için bu iş PK'ya uygulanır.

-- siparişte olup müşteride olmayan yok.
select * from Customers c right join Orders o on c.CustomerID = o.CustomerID 

select * from Orders o right join Customers c on c.CustomerID = o.CustomerID 

-- 2'den fazla tabloyu join etmek istersek
Select * from Products p left join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderId 
