public class KrediUI {
    // Bir arayüzden çağırıcağımızı varsayalım
//    public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager){
//        ogretmenKrediManager.hesapla();
//
//    }
    // bunu hepsi için yapmak istediğim takdirde yukarıdaki gibi yazmam
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.hesapla();
    }
}
