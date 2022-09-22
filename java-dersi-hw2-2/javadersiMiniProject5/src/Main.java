public class Main {
    public static void main(String[] args) {
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
            System.out.println(aranacak + " sayilar listesinde var.");
        } else {
            System.out.println(aranacak + " sayilar listesinde yok.");
        }

    }
}