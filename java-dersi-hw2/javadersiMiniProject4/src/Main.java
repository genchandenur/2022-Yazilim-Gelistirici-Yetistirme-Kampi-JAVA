public class Main {
    public static void main(String[] args) {
        // Arkadaş Sayılar -- 220-284

        int number1 = 220;
        int number2 = 284;
        int totalDivider1 = 0;
        int totalDivider2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0){
                totalDivider1 += i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                totalDivider2 += j;
            }
        }
        if (totalDivider1 == number2 && totalDivider2 == number1) {
            System.out.println(number1 + " and " + number2 + " arkadaş sayıdır.");
        } else {
            System.out.println(number1 + " and " + number2 + " arkadaş sayı değildir.");
        }


    }
}