package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguagesService {
	// iş kuralları
	List<ProgrammingLanguages> getAll();
	ProgrammingLanguages getById(int id);
	void add(ProgrammingLanguages programmingLanguage) throws Exception;
	void delete(int id);
	void update(ProgrammingLanguages programmingLanguage);
	
	
}
