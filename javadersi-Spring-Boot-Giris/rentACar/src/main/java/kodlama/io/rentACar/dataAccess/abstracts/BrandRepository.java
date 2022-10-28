package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

// veritabanı işleri yapacak sınıflara verdiğimiz isimlerdir. Bunlar dao olarak da adlandırabiliyorduk.
public interface BrandRepository {
	List<Brand> getAll();
	

}
