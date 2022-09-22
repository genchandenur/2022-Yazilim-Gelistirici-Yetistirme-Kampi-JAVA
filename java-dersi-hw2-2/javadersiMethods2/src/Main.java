public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        String yeniMesaj = mesaj.substring(0,2);
        //String yeniMesaj = sehirVer();
        // Aşağıdaki gibi yazdır demediğimiz sürece
        // substring bir değer return eder.
        System.out.println(yeniMesaj);

        int sayi = topla(5,7);
        System.out.println(sayi);
    }

    // void operasyonları bir şeyi yaptırmak istediğimizde
    // void operasyonları bir değişkene atayamayız. int gibi..
    public static void ekle(){
        System.out.println("Eklendi.");
    }

    public static void sil(){
        System.out.println("Silindi.");
    }

    public static void guncelle(){
        System.out.println("Guncellendi.");
    }

    // bu fonksiyon int türünde bir değer dondurur.
    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
        //return 5;
    }

    public static String sehirVer(){
        return "Ankara";
    }


}