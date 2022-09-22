package oop1;

import introduction.IndividualCustomer;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		// db'den gelir bu veriler.

		Product product1 = new Product(); // class değişkeni tanımladık.
		// set value
		product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "delonghi_km.jpg";

		// get (read product1 name.)
		// System.out.println(product1.name);

		Product product2 = new Product();

		product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "smeg_km.jpg";

		Product product3 = new Product();

		product3.name = "Kitchen Aid Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "kitchen_km.jpg";

		Product[] products = { product1, product2, product3 };


		/* HTML 
		 * System.out.println("<ul>"); for (Product product : products) {
		 * System.out.println("<li>" + product.name + "<li>");
		 * 
		 * } System.out.println("<ul>");
		 */

		for (Product product : products) {
			System.out.println(product.name);

		}
		
		
		 // getters and setters tanımlandıktan sonra yukarıyı kullanmayız.
		Product product1 = new Product(); 
		// yazmak için set - okumak için get yapıyoruz bundan sonra.
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("delonghi_km.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("smeg_km.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(8);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("kitchen_km.jpg");
		
		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());

		}


		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		// customer class'ından miras alınan özellikler geldi.
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222222");
		individualCustomer.setCustomerNumber("12345");
		
		// bireysel müşteriye özgü field'lar girilir.
		individualCustomer.setFirstName("Handenur");
		individualCustomer.setLastName("Genç");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("1111111111111");
		corporateCustomer.setCustomerNumber("54321");
		

		// trick customers'da tüm müşterileri tuttum.
		Customer[] customers = {individualCustomer,corporateCustomer};
	}

}
