public class Main {
    public static void main(String[] args) {
        // projenin farklı kısımlarında sayiBulmaca() çağırabilirim.
        sayiBulmaca();
        sayiBulmaca();

    }
    // create new methods that finds number
    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;

        boolean var = false;
        for (int sayi : sayilar){
            if (sayi == aranacak){
                var = true;
                break;
            } else {
                var = false;
            }
        }

        if(var){
            mesajVer(aranacak + " sayilar listesinde var.");
            // mesajVer(7);
        } else {
            mesajVer(aranacak + " sayilar listesinde yok.");
            //System.out.println(aranacak + " sayilar listesinde yok.");
        }

    }
    // parametreli method
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}