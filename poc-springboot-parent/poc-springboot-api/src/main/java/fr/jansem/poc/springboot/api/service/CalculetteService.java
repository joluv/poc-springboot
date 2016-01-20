package fr.jansem.poc.springboot.api.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.jansem.poc.springboot.api.dao.CalculetteDAO;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationRequest;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationResultats;
import fr.jansem.poc.springboot.model.domain.tarification.Tarification;

/**
 * Service de gestion des caisses régionales par département
 * 
 * @author rjansem
 *
 */
@Service
public class CalculetteService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CalculetteService.class);

	@Autowired
	private CalculetteDAO calculetteDAO;
	
	/**
	 * Effectue une simulation
	 * 
	 * @param simulation
	 *            les paramètres de la simulation
	 * @return les résultats
	 */
	public SimulationResultats executeSimulation(SimulationRequest simulation) {
		return calculetteDAO.executeSimulation(simulation);
	}

	/**
	 * Exécution de l'ensemble des simulations possibles pour une caisse et un
	 * produit donné
	 * 
	 * @param tarification
	 *            : le tarif associé à la caisse et au produit
	 * @return une liste de résultats de simulation
	 */
	public List<SimulationResultats> computeSimulations(Tarification tarification) {

		Instant starttime = Instant.now();
		List<SimulationResultats> listeSimulationResultats = new ArrayList<>();

		BigDecimal tauxAssurance = tarification.getTauxAssurance();
		BigDecimal tauxCredit = tarification.getTauxCredit();

		BigDecimal montantMinimal = tarification.getMontantMin();
		BigDecimal montantMaximal = tarification.getMontantMax();
		BigDecimal pasMontant = tarification.getPasMontant();
		Integer dureeMinimale = tarification.getDureeMin();
		Integer dureeMaximale = tarification.getDureeMax();
		Integer pasDuree = tarification.getPasDuree();

		BigDecimal montant = montantMinimal;
		Integer duree = dureeMinimale;
		
		while (montant.compareTo(montantMaximal) <= 0) {
			while (duree.compareTo(dureeMaximale) <= 0) {
				SimulationRequest request = new SimulationRequest();
				request.setTauxAssurance(tauxAssurance);
				request.setTauxPret(tauxCredit);
				request.setMontantPret(montant);
				request.setDureePretMois(duree);

				SimulationResultats result = calculetteDAO.executeSimulation(request);
				listeSimulationResultats.add(result);
				duree = duree + pasDuree;
			}
			duree = dureeMinimale;
			montant = montant.add(pasMontant);
		}

		Instant endtime = Instant.now();
		Instant time = endtime.minus(starttime.getMillis());
		LOGGER.info("Simulations effectuées en {} s", time.toString());
		return listeSimulationResultats;
	}

}
