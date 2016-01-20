package fr.jansem.poc.springboot.api.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.jansem.poc.springboot.api.service.CalculetteService;
import fr.jansem.poc.springboot.api.service.TarificationService;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationRequest;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationResultats;
import fr.jansem.poc.springboot.model.domain.tarification.Tarification;

/**
 * Ressources REST exposant les informations sur les caisses régionales
 * 
 * @author rjansem
 *
 */
@RestController
@RequestMapping(value = "/simulation")
public class CalculetteResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalculetteResource.class);

	@Autowired
	private CalculetteService calculetteService;

	@Autowired
	private TarificationService tarificationService;

	@RequestMapping(value = "/execute", method = RequestMethod.POST)
	public SimulationResultats executeSimulation(@RequestBody SimulationRequest simulation) {
		LOGGER.debug("START CalculetteResource.executeSimulation[simulation={}]", simulation);

		if (null == simulation.getDureePretMois() || null == simulation.getTauxPret()
				|| null == simulation.getTauxAssurance() || null == simulation.getMontantPret()) {
			throw new IllegalArgumentException("Un des paramètres est manquant");
		}
		SimulationResultats res = calculetteService.executeSimulation(simulation);
		LOGGER.debug("END CalculetteResource.executeSimulation");

		return res;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<SimulationResultats> getSimulationResultatsByIdCaisseAndIdProduit(
			@RequestParam("idCaisse") String idCaisse, @RequestParam("idProduit") String idProduit) throws Exception {
		List<SimulationResultats> listeSimulationResultats = new ArrayList<>();
		Optional<Tarification> tarif = tarificationService.getTarificationByIdCaisseAndIdProduit(idCaisse, idProduit);

		if (tarif.isPresent()) {
			listeSimulationResultats = calculetteService.computeSimulations(tarif.get());
		} else {
			throw new Exception("Tarification non trouvée pour cette caisse et ce produit");
		}
		return listeSimulationResultats;

	}
}
