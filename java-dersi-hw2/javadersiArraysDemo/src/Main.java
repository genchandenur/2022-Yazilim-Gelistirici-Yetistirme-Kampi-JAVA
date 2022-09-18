public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Hande";
        //ogrenciler[4] = "Ali";
        // Eğer öğrenciler Array'ine bir eleman daha eklersek fakat eleman sayısını güncellemezsek-
        // ArrayIndexOutOfBoundsException hatası alırız.
        System.out.println("-------------------------------------");
        for (int i = 0; i < ogrenciler.length ; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------------------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}