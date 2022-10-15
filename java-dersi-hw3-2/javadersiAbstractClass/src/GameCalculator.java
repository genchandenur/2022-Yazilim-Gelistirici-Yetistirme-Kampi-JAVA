public abstract class GameCalculator {
    public abstract void hesapla(); // default'u yok
    // hesapla abstract class oldugu takdırde
    // kım implemente ediyorsa veya kim inherite ediyorsa
    // hesaplayı içermek zorunda hesaplayı override etmek zorunda.
    // yani kendi hesaplasını yazmak zorunda.

    public final void gameOver(){
        System.out.println("Oyun bitti");
        // GameCalculator'ı kim kullanıyorsa bu gameover operasyonunu oldugu gibi
        // kullanmak zorunda.
    }
}
