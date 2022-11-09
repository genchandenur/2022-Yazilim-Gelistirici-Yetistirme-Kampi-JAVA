package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

// veritabanı işleri yapacak sınıflara verdiğimiz isimlerdir. Bunlar dao olarak da adlandırabiliyorduk.
// class interface'in içini doldurur ve o interface onun referansını tutabilir.
// ama interface interface'i extend edebilir. İçini doldurmaz.
public interface BrandRepository extends JpaRepository<Brand, Integer>{
	// Brand nesnemin Id'si primary key onu integer olarak belirttik.
	
	// içindeki getAll operasyonunu sildik. Çünkü JpaRepository bizim için sağlar.
	

	// BTK akademi - İleri Java Eğitimi - Engin Demiroğ
}
