package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

// Veritabanı işleri yapacak sınıflara verilen isimlendirmelerde kullanılır.
public interface ProgrammingLanguagesRepository {
	// arraylere yeni bri eleman eklediğimizde sıfırdan oluşturmak gerekir
	// fakat listelere yeni eleman eklediğimizde sıfırdan oluşturmaya gerek yoktur.
	
	//listeler
	List<ProgrammingLanguages> getAll();
	// Id'ye göre getirir
	ProgrammingLanguages getById(int id);
	
	// dili ekler 
	void add(ProgrammingLanguages programmingLanguage);
	// dili siler
	void delete(int id);
	// listeyi günceller
	void update(ProgrammingLanguages programmingLanguage);

	
}
