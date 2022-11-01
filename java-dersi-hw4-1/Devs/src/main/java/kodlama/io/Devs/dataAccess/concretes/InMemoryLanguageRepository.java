package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Repository  // Bu sınıf bir DataAccess nesnesidir.
public class InMemoryLanguageRepository implements ProgrammingLanguagesRepository{

	List<ProgrammingLanguages> programmingLanguages;
	
	
	//Inmemory'i çalıştırınca burası new'lenecek.
	public InMemoryLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguages>();
		programmingLanguages.add(new ProgrammingLanguages(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguages(2,"Python"));
		programmingLanguages.add(new ProgrammingLanguages(3,"Java"));
		programmingLanguages.add(new ProgrammingLanguages(4,"R"));
		programmingLanguages.add(new ProgrammingLanguages(5,"Go"));
		
	}


	@Override
	public List<ProgrammingLanguages> getAll() {
		return programmingLanguages;
	}


	@Override
	public ProgrammingLanguages getById(int id) {
		for (ProgrammingLanguages programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;

	}


	@Override
	public void add(ProgrammingLanguages programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}


	@Override
	public void delete(int id) {
		ProgrammingLanguages DeleteProgrammingLanguages = getById(id);
		programmingLanguages.remove(DeleteProgrammingLanguages);
		System.out.println(DeleteProgrammingLanguages + " programming language is deleted.");
		
	}


	@Override
	public void update(ProgrammingLanguages programmingLanguage) {
		ProgrammingLanguages UpdateProgrammingLanguages = getById(programmingLanguage.getId());
		UpdateProgrammingLanguages.setProgrammingLanguageName(programmingLanguage.getProgrammingLanguageName());
		System.out.println(programmingLanguage + " is updated to " + UpdateProgrammingLanguages);
			
		}
		

}
