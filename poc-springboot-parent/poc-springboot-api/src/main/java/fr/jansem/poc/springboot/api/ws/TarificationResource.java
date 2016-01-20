package fr.jansem.poc.springboot.api.ws;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.jansem.poc.springboot.api.service.TarificationService;
import fr.jansem.poc.springboot.model.domain.tarification.Tarification;

/**
 * Ressources REST exposant les informations sur les caisses régionales
 * 
 * @author rjansem
 *
 */
@RestController
@RequestMapping(value = "/tarification")
public class TarificationResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(TarificationResource.class);

	@Autowired
	private TarificationService tarificationService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Tarification findByIdCaisseAndIdProduit(@RequestParam("idCaisse") String idCaisse,
			@RequestParam("idProduit") String idProduit) throws Exception {
		LOGGER.debug("START TarificationResource.findByIdCaisseAndIdProduit[idCaisse={}, idProduit={}]", idCaisse,
				idProduit);
		Optional<Tarification> tarif = tarificationService.getTarificationByIdCaisseAndIdProduit(idCaisse, idProduit);
		LOGGER.debug("END CaissesRegionalesResource.findByCodePostal");

		if (tarif.isPresent()) {
			return tarif.get();
		}

		throw new Exception("Tarif non trouvé");
	}
}
