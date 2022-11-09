package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;

// Restful yapılar için controller oldugunu söylememiz gerekiyor.
@RestController //annotation
@ RequestMapping("api/brands") // buna nasıl ulaşılsın.
public class BrandsController {
	private BrandService brandService;

	@Autowired  // autowired diyince gider alttaki metodun parametrelerine bakar. Uygulamayı tara kim brandService'i implement ediyor
	// brandmanager ediyor. Onun new'lenmiş halini bana ver. 
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	// buna erişim sağlamak için getmapping
	@GetMapping("/getall")
	// www.kodlama.io/api/brands/getAll dediğimizde örn alt taraf çalışır.
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
		
	}

}
