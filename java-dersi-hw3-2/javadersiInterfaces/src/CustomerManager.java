public class CustomerManager {

    // 1. yontem - tasarım deseni
    private ICustomerDal customerDal;

    // 2. yöntem
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        // dal'ın içinde add var.
        // bu kısma iş kodları yazılır.

        // 1. yöntem
        customerDal.add();

    }
}
