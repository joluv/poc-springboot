package fr.jansem.poc.springboot.web.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import fr.jansem.poc.springboot.model.domain.calculette.SimulationRequest;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationResultats;

@Service
public class SimulationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SimulationService.class);

	private static final String CAISSE_ID_PARAM = "?idCaisse=";
	private static final String PRODUIT_ID_PARAM = "&idProduit=";

	@Value("${env.api.urlSimulations}")
	private String url;

	public List<SimulationResultats> getSimulationsByCaisseAndProduit(String idCaisse, String idProduit) {
		RestTemplate restTemplate = new RestTemplate();

		String fullUrl = url + CAISSE_ID_PARAM + idCaisse + PRODUIT_ID_PARAM + idProduit;

		ResponseEntity<List> entity = restTemplate.getForEntity(fullUrl, List.class);

		return entity.getBody();
	}

	public void executeSimulation(SimulationRequest req) {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders requestHeaders = new HttpHeaders();

		HttpEntity<SimulationRequest> httpEntity = new HttpEntity<SimulationRequest>(req, requestHeaders);

		try {
			restTemplate.exchange("url", HttpMethod.POST, httpEntity, SimulationResultats.class);
		} catch (HttpClientErrorException e) {
			throw new RuntimeException("Erreur lors de la simulation");
		}
	}
}
