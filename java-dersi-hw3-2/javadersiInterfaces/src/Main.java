public class Main {
    // polymorphism'in interface'lerle uygulama versiyonu.
    public static void main(String[] args) {

        // aşağıdaki gibi interface'lerde abstractlar gibi new'lenemez.
        // imza taşırlar.
        // extend değil implementation'dır.
        // implementation: bir class birden fazla interface'i implemente edebilir.


        //ICustomerDal customerDal = new ICustomerDal()

        // şunu yazabilirim.
        // interface onu implemente eden class'ın referansını tutabilir!
        //ICustomerDal customerDal = new OracleCustomerDal();

        //interface implemente edilmesi istenen durumlarda
        // ayrıca implemente edilsin istendiğinde kullanılır.



        // yazılım projelerinde 3 katman vardır.
        // dataaccess(dal) - iş katmanı - arayüz
        // bu katmanlardaki geçişlerde interface'ler kullanılır.
        // nedeni ise bağımlılığı azaltmaktır.


// 1. yontem
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
//        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add();


    }
}