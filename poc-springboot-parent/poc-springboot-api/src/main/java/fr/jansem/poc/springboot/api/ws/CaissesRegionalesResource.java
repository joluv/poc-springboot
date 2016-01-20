package fr.jansem.poc.springboot.api.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.jansem.poc.springboot.api.service.CaissesRegionalesService;
import fr.jansem.poc.springboot.model.domain.caisses.CaisseRegionale;

/**
 * Ressources REST exposant les informations sur les caisses régionales
 * 
 * @author rjansem
 *
 */
@RestController
@RequestMapping(value = "/caissesRegionales")
public class CaissesRegionalesResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(CaissesRegionalesResource.class);

	@Autowired
	private CaissesRegionalesService caissesRegionalesService;

	@RequestMapping(value = "/caisseByCodePostal", method = RequestMethod.GET)
	public CaisseRegionale findByCodePostal(@RequestParam("codePostal") String codePostal) {
		LOGGER.debug("START CaissesRegionalesResource.findByCodePostal[codePostal={}]", codePostal);
		CaisseRegionale caisse = caissesRegionalesService.getCaisseRegionaleByCodePostal(codePostal);
		LOGGER.debug("END CaissesRegionalesResource.findByCodePostal[caisseRegionale={}]", caisse.getNom());

		return caisse;
	}
}
