// we define product attributes!
public class Product {
    // private sadece tanımlandığı blokta geçerlidir.
    // private tanımladığında başka yerde ulaşamazsın.

    // Bir class'ı parametreli ve parametresiz olarak var olması ve istediğini kullanma durumuna overloading denir.
    // Bunları class'ta tanımlarım ama mainde ikisini kullanamam.
    public Product(int id,String name,String description,double price,int stockAmount,String renk){
        // costructor
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }
    public Product(){

    }
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;

    // Single responsibility principle
    // Bir class bir metod sadece bir işi yapar/yapmalı

    // yukarıda private tanımlanan fieldlara ulaşmak için
    // getter ve setter tanımlarız

    // getter tanımlarken void demeyiz
    // bir değer return etmesini bekleriz.
    // setter tanımlarken void kullanırız.
    //  değerini değiştir, ekrana bir şey döndürme.
    public int getId(){
        return id;
    }
    // sadece get'i tanımlarsak id'yi okuyabilir ama yazamaz
    //product.getId() diyerek okur. (read only)


    // burda set edilmesi istenen değer parametre olarak verilmelidir.
    public void setId(int id) {
        // eğer parametre olarak verdiğin değişkeni de aynı adda tanımladıysan
        // aşağıdaki gibi bir kullanım daha doğru olacaktır.
        // this bu class'taki id anlamı taşır.
        // _id şekilde tanımlanan tüm değişkenler this
        // yazımı gibi eksikliklerden korur.
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    // diğer field'lar içinde otomatik olarak tanımlayabilirim.
    // field'lardan birinin üzerinde sağ click - refactor - encapsulate - refactor
    // yukarıdaki yontemi kullanırsam başta private tanımlamama gerek yok encap. işleminde de otomatik
    // tanımlayabilirim.

    public String getKod(){
        return this.name.substring(0,1) + id;
        // kullanıcının düzenlemesine engel olabilirim.
    }
}
