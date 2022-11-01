package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
// Spring Boot Annotations 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@RestController  // annotation
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguagesService programmingLanguagesService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
		super();
		this.programmingLanguagesService = programmingLanguagesService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguages> getAll() {
		return programmingLanguagesService.getAll();
	}
	
	@GetMapping("/getId")
	public ProgrammingLanguages getById(int id) {
		return programmingLanguagesService.getById(id);
	}
	
	@PutMapping("/add")
	public void add(ProgrammingLanguages programmingLanguage) throws Exception {
		programmingLanguagesService.add(programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		programmingLanguagesService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(ProgrammingLanguages programmingLanguage) {
		programmingLanguagesService.update(programmingLanguage);
	}

}
