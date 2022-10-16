public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product newproduct = new Product();
        newproduct.name = "Mouse";
        newproduct.price = 10;
        productManager.add(newproduct);

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.Update();

    }

}