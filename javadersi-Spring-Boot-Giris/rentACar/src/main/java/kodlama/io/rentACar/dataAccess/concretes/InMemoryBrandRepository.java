package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository  // yani bu sınıf bir veritabanı / data access nesnesisin diyoruz.
public class InMemoryBrandRepository implements BrandRepository{

	// burdaki List interface 
	List <Brand> brands;
	
	// ​Neden List yaptığımız halde new'lerken Arraylist yaptık? List yapsak olmaz mıydı?
	// ArrayList'in source koduna baktığımızda List'in implementasyonu olduğunu görürüz. List bir interface.
	// Bir çok koleksiyon List interface'inden implemente ediliyor. Polimorfizm var.
	
	public InMemoryBrandRepository() {
		// burdaki ArrayList somut
		brands = new ArrayList<Brand>();
		// marka listesi yapıyorum çünkü business'ı kodlamak istiyorum
		brands.add(new Brand(1 , "BMW"));
		brands.add(new Brand(2 , "Audi"));
		brands.add(new Brand(3 , "Toyota"));
		brands.add(new Brand(4 , "Mercedes"));
		brands.add(new Brand(5 , "Ford"));

	}
	
	@Override
	public List<Brand> getAll() {
		return brands;
	}

}
