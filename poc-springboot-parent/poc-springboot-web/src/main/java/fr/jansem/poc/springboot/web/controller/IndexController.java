package fr.jansem.poc.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.jansem.poc.springboot.model.domain.Personne;
import fr.jansem.poc.springboot.model.domain.caisses.CaisseRegionale;
import fr.jansem.poc.springboot.web.service.CaissesRegionalesServices;
import fr.jansem.poc.springboot.web.service.PersonneService;

@Controller
public class IndexController {
	
	@Autowired
	private PersonneService personneService;

	@Autowired
	private CaissesRegionalesServices caissesRegionalesServices;

	@RequestMapping("/")
	public String displayIndex() {
		return "index";
	}

	@RequestMapping("/step1")
	public ModelAndView firstStep() {
		ModelAndView mav = new ModelAndView("form/step1");
		Personne personne = personneService.getPersonne();
		mav.addObject("name", personne.getNom());
		mav.addObject("firstName", personne.getPrenom());
		mav.addObject("codePostal", "");
		return mav;
	}

	@RequestMapping(value = "/step2", method = RequestMethod.POST)
	public ModelAndView secondStep(@ModelAttribute("name") String name, @ModelAttribute("firstName") String firstName,
			@ModelAttribute("codePostal") String codePostal) {
		CaisseRegionale caisse = caissesRegionalesServices.getCaisseRegionaleByCodePostal(codePostal);
		ModelAndView mav = new ModelAndView("form/step2");
		mav.addObject("name", name);
		mav.addObject("firstName", firstName);

		mav.addObject("libelleCaisse", caisse.getNom());
		mav.addObject("region", caisse.getRegion());

		return mav;
	}

}
