public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
    // ogrenciye farklı faiz uygulamak istediğim durumda
    // BaseKrediManager'daki hesapla fonksiyonu ile aynı imzaya sahip
    // aynı gorevi yapan fonksiyonu buraya yazdıgımızda artık ogrencı için
    // burdaki hesapla fonksiyonu calısır. Buna overriding denir.
    // base'in hesaplasını burda öğrenci için ezmiş olduk.
}
