public class Main {
    public static void main(String[] args) {
        // kalın ve ince sesli harfler
        char letter = 'e';

        char letterup = Character.toUpperCase(letter);

        switch (letterup){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " kalın sesli harf");
                break;
            default:
                System.out.println(letter + " ince sesli harf");
        }

    }
}