import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        //EmailLogger logger = new EmailLogger();
        //logger.Log("Log mesajı");
        // overriding

//        BaseLogger loggers[] = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
//            // consoleLogger ekledik
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); //çok biçimlilik
        customerManager.add();

    }
}