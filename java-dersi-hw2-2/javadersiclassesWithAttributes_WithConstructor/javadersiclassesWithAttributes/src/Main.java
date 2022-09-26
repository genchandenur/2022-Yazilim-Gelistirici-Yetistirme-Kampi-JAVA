public class Main {
    public static void main(String[] args) {
        // classes also keeps fields and attributes.
        //Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 4,  "siyah");

        Product product = new Product();
        // getter ve setter ile kullanmak istediğimde
        product.name = "Laptop";
        product.id = 1;
        // setter tanımladıktan sonra şu şekilde kullanırsın
        // product.setId(1);

        product.description = "Asus Laptop";
        product.price = 7000;
        product.stockAmount = 3;
        //System.out.println(product.name);

        ProductManage productManager  = new ProductManage();
        productManager.Add(product);

        // Encapsulation
        //productManager.Add2(1,"","","","");

        // product.getId();

        // Bu şekilde kodu sadece okuyabilirim.
        System.out.println(product.getKod());

    }
}