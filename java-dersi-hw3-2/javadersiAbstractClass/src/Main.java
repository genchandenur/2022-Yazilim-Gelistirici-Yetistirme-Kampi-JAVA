public class Main {
    public static void main(String[] args) {
        //WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        //womanGameCalculator.hesapla();
        //womanGameCalculator.gameOver();

        // gameover ekranı tum kullanıcılar için aynı olsun istiyoruz.
        // fakat hesaplama işlemini her kullanıcı için farklı hesaplamak istiyoruz.
        // 2 yontem var birisi hesapla fonksiyonunu override ederim.
        //diğer kullanım ise abstraction'dır.


        // base'i gizlemek için de kullanılır abstract sınıflar
        // Aşağıdaki gibi bir kullanım yapamazsın mesela.
        //GameCalculator gameCalculator = new GameCalculator();
        // abstract sınıflar asla new'lenemez.
        // Eğer new'lenmek istenirse içersindeki abstract operasyonları ezmek gerekir. Fakat bu
        // kullanım kötü bir kullanım olur.

        // Fakat şunu diyebilirim
        //GameCalculator gameCalculator = new WomanGameCalculator();


    }
}