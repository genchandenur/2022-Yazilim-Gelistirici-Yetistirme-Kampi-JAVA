package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Service // Bu sınıf bir business nesnesidir.
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService{
	
	private ProgrammingLanguagesRepository programmingLanguagesRepository;
	
	@Autowired
	public ProgrammingLanguagesManager(ProgrammingLanguagesRepository programmingLanguagesRepository) {
		super();
		this.programmingLanguagesRepository = programmingLanguagesRepository;
	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		return programmingLanguagesRepository.getAll();
	}

	@Override
	public ProgrammingLanguages getById(int id) {
		return programmingLanguagesRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguages programmingLanguage) throws Exception {
		if (programmingLanguage.getProgrammingLanguageName().isEmpty()) {
			throw new Exception("Programming language cannot be entered empty!");
		} else {
			for (ProgrammingLanguages languages : programmingLanguagesRepository.getAll()) {
				if (languages.getProgrammingLanguageName().equals(programmingLanguage.getProgrammingLanguageName())) {
					throw new Exception("Programming language already exist!");
				} else {
					programmingLanguagesRepository.add(programmingLanguage);
				}
			}
			
		}
		
	}

	@Override
	public void delete(int id) {
		programmingLanguagesRepository.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanguages programmingLanguage) {
		programmingLanguagesRepository.update(programmingLanguage);
		
	}

}
