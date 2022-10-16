public class DatabaseHelper {
    public static class Crud { // create read update delete
        public static void Delete() {}

        public static void Update() {}

    }

    public static class Connection{
        public static void createConnection(){}
    }

    // bu yapılar önerilmiyor (çünkü single responsibility)
    // bir class'ın bir iş yapması onerilir.
    // cruddatabasehelper ve connectiondatabasehelper diye class'lar açılması önerilir.
    //

}
