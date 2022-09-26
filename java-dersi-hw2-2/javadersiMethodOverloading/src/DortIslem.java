public class DortIslem {
    public int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
    // artık 3 sayı toplayan bir operasyona ihtiyacımız var.
    // 2 metodu da aynı isimle yazdığımda bir sıkıntı oluşmuyor
    // Buna method overloading deniyor.
    public int topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }
}
