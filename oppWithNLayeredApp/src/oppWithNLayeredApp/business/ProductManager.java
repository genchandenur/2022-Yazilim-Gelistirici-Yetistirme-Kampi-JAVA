package oppWithNLayeredApp.business;

import java.util.List;

import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.dataAccess.jdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class ProductManager {

	// manager kullanırken bomboş çağırıyoruz
	// onlarca metodum olucak onlar çalışacak
	// burada ProductDao oluştursam private 
	// bağımlılığı başka yer söylesin jdbc'den mi hibernate mi
	private ProductDao productDao;
	// polymorphism
	// öyle bir sistem yap ki 3 yere loglasın.
	//private List<Logger> loggers; //list koleksiyon
	private Logger[] loggers;
	
	
	// source - generate constructer using fields de productDaoyu seç
	// alttaki 3 satır geldi.
	// ProductManager new'lendiğinde bana bir ProductDao ver demek.
	public ProductManager(ProductDao productDao, Logger[] loggers) { // dependence injection  --- List<Logger> loggers bunu array olarak tanımlarsak şöyle yazarım: Logger[]
		//super();
		this.productDao = productDao;
		this.loggers = loggers;
	}


	// bir ürün eklerken aynı isimle eklenmesin
	// dublicate olmasın
	// örn, aynı tc ile bankanın 2 kere müşterisi olamazsın.
	// Aynı isimde ürün ekleyememe olayına business domain deniyor
	// yani iş kuralı sizin domain'inize özgüdür.
	
	// throws exception-bu metodu çağırdığında hata fırlatabilir demek.
	public void add(Product product) throws Exception { // Bu içerdeki product ileride response request pattern denilen bir yapıya göre tekrar ele alıcaz.
		// aynı add yapısını buraya koyduk
		// verilen product ile ilgili
		// iş kurallarını buraya yazarız
		
		// eklediğim nesneler buraya geliyor.
		 
		// diyelim ki sisteme 10tl altında ürün ekleyemeyiz
		if (product.getUnitPrice()< 10) {
			// eğer böyle ise hata fırlatırız. Eğer hata fırlatıldıysa uygulama durur.
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
		}
		
		// jd yzp ctrl+space de tamamlar yukarıda otomatik import işlemi de yapar.
		
		//jdbcProductDao productDao = new jdbcProductDao();
		//HibernateProductDao productDao = new HibernateProductDao();

		
		// Interface onu implemente eden sınıfın new'ini/instance'ını/referansını tutabilir.
		
		// 26 - 29 satırlar oluşturulduğunda alttaki 2 kötü kod satırı silinebilir. 
		// artık sadece interface'e bağlıyım.
		// manager'ın vs umrunda olmadan artık ProductDao'ya
		// ne yollarsan yolla 
		
		//ProductDao productDao = new HibernateProductDao();
		
		//ProductDao productDao = new jdbcProductDao();

		// kodun hala bircok yerinde jdbcProductDao var mesela
		// bir katman başka bir katmanın class'ını kullanıyorken sadece interface'inden erişim kurmalıdır!!!!
		//(business data access ve arayüz ve apiler için geçerli, entityler için geçerli değil onlar özellik nesneleri)
		
		productDao.add(product);
		
		
		//logger'ları çalıştırıyorum. 
		// [db,mail] tek tek logları çalışır. İşte bu polymorphism.
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
			
		
	}
}
