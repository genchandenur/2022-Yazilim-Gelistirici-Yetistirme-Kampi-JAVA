public class Main {
    public static void main(String[] args) {
        // Primitive types: boolean,    char,       byte,      short,    int,     long,     float,     double
        // Kind of value:     t/f    single char   integer    integer  integer   integer   point nm   point nm
        // Memory Used:     1 byte   2 bytes    1 byte    2 bytes    4 bytes   8 bytes    4 bytes    8 bytes
        int sayi = 12;
        sayi = 14;
        byte bsayi = 127;
        double dsayi = 12.5;
        char karakter = 'A'; // ascii tüm karakterlerin sayısal karşılığı var.
        String sehir = "ANKARA"; // char dizisi

        boolean dogruMu = false;
        if (dogruMu == true){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}