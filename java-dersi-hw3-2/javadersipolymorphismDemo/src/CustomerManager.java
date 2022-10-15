import javax.xml.crypto.Data;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        // bu constructor new işlemi yaparken çalışır.
        this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri Eklendi");
        //DatabaseLogger logger = new DatabaseLogger();
        //logger.Log("Log Mesajı");
        // bir yerde newlemek işlemini çok sık tekrar etmek demek
        // kodun o kısma çok bağımlı olması demek.
        this.logger.log("log mesajı");
    }
}
