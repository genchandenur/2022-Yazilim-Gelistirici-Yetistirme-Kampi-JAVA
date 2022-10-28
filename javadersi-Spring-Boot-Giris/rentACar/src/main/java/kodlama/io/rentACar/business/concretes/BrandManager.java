package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;


// IoC - Bellekte bir şeyi new'le isteyene o referansı ver demek. 

@Service // bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	

	@Autowired   // gidiyor alttaki constructor'un parametresine bakıyor. Kim bu brandRepository interface'ini implemente ediyor.
	// InMemoryBrandRepository ediyor. onu new'liyor. Spring'in yeni versiyonlarında autowired yazmaya gerek yok ama arkada çalışıyor.
	public BrandManager(BrandRepository brandRepository) {
		// business interface dışında dataaccess'ten haberi yok. Bağımsızlaştırıyoruz (gevşek bağlı sistem)
		super();
		this.brandRepository = brandRepository;
	}



	@Override
	public List<Brand> getAll() {
		// iş kuralları
		
		return brandRepository.getAll();
	}

}
