public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.hesapla();

        KrediUI krediUI = new KrediUI();
        // OgretmenKrediManager'ın içerisindeki kod burada çalışır.

        krediUI.KrediHesapla(new OgretmenKrediManager());
        // bunu hepsi için yapmak istediğimde hepsi için
        // krediUI oluşturamam.

        // krediUI.KrediHesapla fonksiyonu KrediUI dosyasına girdi olarak
        // BaseKrediManager verdiğimde hata vermedi.
        // çünkü her ikisi içerisinde referans tipini tutuyor.

        krediUI.KrediHesapla(new TarimKrediManager());

        // Birbirinin arternatifi olan geçişleri yapmak için
        // if'ler kullanılmamalıdır. (spagetti code)
        // Bunun yerine inheritance'ları kullanmalıyız !!!

        // yeni kredi tipi ekledik bu noktada (AskerKrediManager)

        krediUI.KrediHesapla(new AskerKrediManager()); //hata vermez!!
        // burası polymorphism.

    }

}