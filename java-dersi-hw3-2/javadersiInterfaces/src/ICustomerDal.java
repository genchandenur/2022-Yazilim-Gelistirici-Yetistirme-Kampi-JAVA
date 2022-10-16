public interface ICustomerDal {
    // Dal - data access layer: veritabı ile ilgili operasyonlar buraya yazılır.
    // interface class değildir.
    // sadece referans tutucu görevi gorur.

    // bir interface'in üyeleri zaten publictir.
    // dolayısıyla başa public gelmesine gerek yoktur.
    void add();

}
