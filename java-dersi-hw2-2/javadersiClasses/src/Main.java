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
    }
}

