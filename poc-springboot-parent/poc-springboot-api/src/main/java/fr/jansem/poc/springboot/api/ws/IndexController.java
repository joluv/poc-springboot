package fr.jansem.poc.springboot.api.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.jansem.poc.springboot.model.domain.Personne;

@RestController
public class IndexController {

	@RequestMapping(value="/personne", method = RequestMethod.GET)
	public Personne test() {
		Personne pers = new Personne();
		pers.setNom("Test");
		pers.setPrenom("Test");
		pers.setAge(20);
		return pers;
	}


}
