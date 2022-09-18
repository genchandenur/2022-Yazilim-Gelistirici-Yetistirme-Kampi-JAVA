public class Main {
    public static void main(String[] args) {
        // Mükemmel sayılar
        // 6 -- 1,2,3
        int number = 28;
        int totalDivider = 0;

        for (int i=1;i<number;i++){
            if (number % i == 0){
                totalDivider += i;
            }
        }
        if (number == totalDivider){
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}