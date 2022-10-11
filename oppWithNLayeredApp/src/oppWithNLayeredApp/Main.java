package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.FileLogger;
import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.jdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1,"Iphone XR",10000);
		//Product product1 = new Product(1,"Iphone XR",9);
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		// loglamadan vazgeçersek başka bir zaman 
		//Logger[] loggers = {};

		// arayüz iş birimi ile iletişim kurar.
		// arada api yok suanda. db'na gidemez.
		
		ProductManager productManager  = new ProductManager(new HibernateProductDao(), loggers); //burda sisteme ne yolladıysam artık ona göre çalışır kod bağımlı değil. 
		productManager.add(product1);
	}

}

