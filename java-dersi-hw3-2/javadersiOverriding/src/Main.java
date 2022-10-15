public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //System.out.println(ogretmenKrediManager.hesapla(1000));

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new TarimKrediManager()
        , new OgrenciKrediManager()};

        for (BaseKrediManager krediManager:baseKrediManagers){
            System.out.println(krediManager.hesapla(1000)); //polymorphism
            // öğrenciye uygulananacak kredinin farklı olması
            // durumunda bu şekilde kullanamayız. Tüm kredi turleri
            // için aynı faiz oranına göre hesap yapıyoruz.
        }
        // javada bir class'ın herhangi bir operasyonu biz aksini belirtmediğimiz sürece
        // overridable'dır. Yani üzerine yazılabilir.

    }
}