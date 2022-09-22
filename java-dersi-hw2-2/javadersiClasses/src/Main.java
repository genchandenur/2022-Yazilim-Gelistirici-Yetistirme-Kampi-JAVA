public class Main {
    public static void main(String[] args) {
        // CustomerManager türünde bir örnek oluşturucam.
        // classes are references type.

        // Bellekte 2 alan var. Bunlar;
        // "CustomerManager customerManager" bellekte oluşuyor.(stack)
        // cm 101 diye bir referans nm alıyor. heapten süslü prz. tutuyor.
        //        Stack              Heap
        //     **********         **********
        // 101 *cm      *         *{      }*
        // 102 *cm2     *         *{      }*
        //     **********         **********

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // 2 tane aynı tipte nesnemiz var
        // 2si de bellekte ayrı ayrı tutuluyor
        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;

        // Üstteki kod ikisinin referans numarasını eşitliyor. Yani;
        //        Stack              Heap
        //     **********         **********
        // 102 *cm      *         *{      }* 101
        // 102 *cm2     *         *{      }* 102
        //     **********         **********

        // Artık önceki 101 ref. nm'lu obje 102'nin heapte
        // tutulan bilgisini kulllanıyor.

        // Herhangi bir referansı tutan kimse kalmazsa
        // heap'teki 101 GC (Garbage Collector) tarafından
        // silinir.

        // değer ve referanslar
        // bunlar value type yukarısı reference type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // sayi2 = 10
        //        Stack              Heap
        // ****************         ***************
        // *sayi1=10      *         *             *
        // *sayi2=20      *         *             *
        // ****************         ***************

        //        Stack              Heap
        // ****************         ***************
        // *sayi1=10      *         *             *
        // *sayi2=10      *         *             *
        // ****************         ***************

        //        Stack              Heap
        // ****************         ***************
        // *sayi1=30      *         *             *
        // *sayi2=10      *         *             *
        // ****************         ***************

        // value type herşey stack'te oluşur.
        // Stack'te güncellenir.

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};

        sayilar2 = sayilar1;

        sayilar1[0] = 10;

        System.out.println(sayilar2[0]);
        // sayilar2[0] = 10 olur.
        // diziler references type

        //        Stack              Heap
        //     **********         **********
        // 101 *S1      *         *{1  2  3}* 101
        // 102 *S2     *          *{4  5  6}* 102
        //     **********         **********

        //        Stack              Heap
        //     **********         **********
        // 101 *S1      *         *{1  2  3}* 101
        // 101 *S2     *          *{4  5  6}* 102
        //     **********         **********

        // ikisi de S1'in heap'ine gidiyor.

        //        Stack              Heap
        //     **********         **********
        // 101 *S1      *         *{10  2  3}* 101
        // 101 *S2     *          *{4   5  6}* 102
        //     **********         **********
    }
}

