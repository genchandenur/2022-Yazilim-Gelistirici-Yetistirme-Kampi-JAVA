public class ProductValidator {
    // bir ürünü kaydederken, güncellerken
    // kurallara uygun olup olmadığını kontrol ederiz.
    // ana class'ı static yapamayız c#'ta yapılabilir.
    // ama inner class(bir class'ın içindeki başka bir class)

    static {
        // burda çalıştırmak istersek şöyle bir static blok eklemeliyiz.
        // bu blok birden fazla oluşturulabilir. Ne kadar oluşturulursa
        // hepsi çalışır. (yaygın bir kullanım değildir.)
        System.out.println("Static yapıcı blok çalıştı.");
    }

    public ProductValidator(){ // constructor
        // yapıcı blok -  new'leyince çalışır.
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        // ProductValidator'un operasyonlarının yani isValid'in
        // direk mainde gelmesini istersem (ProductValidator'ı
        // new'lemeden) bu operasyonu static olarak yazmalıyım.
        // new'lediğimiz zaman onun bir örneği oluşur fakat işimiz bitince bellekten atılır
        // static tanımladıgında o web uygulaması sıfırlanmadan bellekten atılmaz.
        // yardımcı araçlar belki static yapılabilir ama ProductManager gibi buyuk sınıflar
        // static yapılmamalıdır.
        // bir metodu static yaptıgımız takdirde class ismiyle direk çağırılabilir.

        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        } else{
            return false;
        }

    }
    public void bişey(){
        // bu operasyon static değil mesela
        // .bunu çağırabilmek için ProductValidator'u new'lemek gerekir.

    }
/*    public static class BaskaBirClass{
        public static void Delete(){
            // bu şekilde bir inner class static olarak tanımlanabilir
            // içindeki butun operasyonlar static olur
        }
    }*/


}
