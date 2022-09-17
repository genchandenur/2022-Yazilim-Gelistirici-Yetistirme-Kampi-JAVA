package introduction;

public class Main {
	
	// main javada başlangıç metodudur. (burası yorum satırıdır.)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ekrana bastırma
		System.out.println("Hello World from Java!");
		
		// metinsel veri tanımlama
		// değişken isimlendirmeleri Java'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		// tam sayı tanımlama
		int vade = 12;
		// long ile de tam sayı tutulabilir.
		
		// ondalık sayı tanımlama
		double dolarDun = 18.25;
		double dolarBugun = 18.20;
		
		// mantıksal veri tipleri tanımlama
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //false
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);	
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);	
		}
		
		// array tanımlama. Tek bir değişkende çok sayıda veri tutmak istersem array'de saklarım. 
		// bir projede bu tarz veriler bir db'den gelir.
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
