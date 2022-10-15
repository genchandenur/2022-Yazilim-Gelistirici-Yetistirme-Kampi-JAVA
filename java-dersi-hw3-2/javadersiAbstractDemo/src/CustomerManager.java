public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        // dersek oracle'a bağlıyız.
        //OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        //oracleDatabaseManager.getData();
        databaseManager.getData();
    }
}
