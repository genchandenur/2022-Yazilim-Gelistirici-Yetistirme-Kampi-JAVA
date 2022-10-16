public class ProductManager {
    public void add(Product product){
        //ProductValidator productValidator = new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

        //ProductValidator productValidator = new ProductValidator();
        //productValidator.bişey();
        // yukarıdaki bişey operasyonu için new'lemeyi kaldırırsak yapıcı blok ÇALIŞMAZ.
        // C#'ta yapıcı blok static'te de çalışır.
    }
}
