public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
    }

    // bir operasyonu herkes için aynı yapmak ve override edilmesini istemezsek ne yapmalıyız?
    // public'i private yapmak yanlış bu durumda. Eğer private yaparsak inherite ettiği yerde kullanamazdık
    // private kendi bloğunda geçerli demektir.
    //public final double hesapla(double tutar) gibi final anahtar kelimesiyle kullanmalıyım.
    // final key word'unu kullandığımda OgrenciKrediManager içerisindeki hesapla fonksiyonu hata verdi override edemedi.
}
