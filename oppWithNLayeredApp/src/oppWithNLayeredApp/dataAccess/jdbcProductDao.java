package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;

//Dao - data access object 
public class jdbcProductDao implements ProductDao { // bu class ProductDao kurallarına uymak zorunda olan bir sınıfsın diyor.
	// veri tabanına ürün ekleyebilmek istiyorum
	// public başka paketlerden erişim sağlayabilmemizi sağlıyordu.
	public void add(Product product) {
		// sadece db erişim kodları buraya yazılır. (SQL)
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}

//JDBC'den Hibernate'e gecildi.
