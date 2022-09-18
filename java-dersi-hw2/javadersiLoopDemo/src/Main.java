public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti..");

        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti..");

        for (int i = 2; i < 10; i+=2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti..");

        // while loop
        int i = 2;
        while(i < 10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti..");
        // do-while loop
        int j = 100;
        do{
            // şart sağlanmadığında bile 1 kere çalışır.
            System.out.println(j);
            j+=2;
        } while(j < 10);
        System.out.println("Do-While döngüsü bitti..");
        }

}
