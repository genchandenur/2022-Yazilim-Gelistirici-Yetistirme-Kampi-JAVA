import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

/*        System.out.println("Eleman sayısı: " +mesaj.length());
        System.out.println("5. eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasın!"));
        System.out.println(mesaj);

        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("l"));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5 ,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('a'));*/

        System.out.println(mesaj.replace(' ','-'));

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println("Mesaj: " + mesaj);
        System.out.println("Yeni Mesaj: " + yeniMesaj);

        System.out.println(mesaj.substring(2)); // 2. indexten itibaren ekrana basar. (parçalar)

        System.out.println(mesaj.substring(2,5)); // 2'den başlar 5. indexi hesaba katmaz.

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String mesaj1 = "     Bugün hava çok güzel     ";

        System.out.println(mesaj1);

        System.out.println(mesaj1.trim());




    }
}