public class ProductManage {
    public void Add(Product product){
        //JDBC to save db
        System.out.println("Ürün Eklendi: " + product.name);
    }

    public void Add2(int id, String name, String description,int stockAmount, double price){
        // Bu kullanım hatalıdır.
        // Çünkü ürüne farklı bir özellik eklendiğinde kod satırında her add2 metodunu çağırdığınız
        // yerde değişiklik yapmak gerekir.
    }


}
