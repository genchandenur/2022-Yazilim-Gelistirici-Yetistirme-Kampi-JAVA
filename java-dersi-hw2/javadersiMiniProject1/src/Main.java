public class Main {
    public static void main(String[] args) {
        // Asal Sayılar
        int number = 2;
        int remainder = number % 2;

        System.out.println(remainder);

        boolean isPrime = false;

        if (number<=2){
            System.out.println("Invalid Number");
        } else {
        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                isPrime = true;
                break;
            }
            else{
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Number is not a prime number");
        } else{
            System.out.println("Number is a prime number");
        }
        }
    }
}