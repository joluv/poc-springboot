package fr.jansem.poc.springboot.web.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.jansem.poc.springboot.model.domain.caisses.CaisseRegionale;

/**
 * Service métier d'appel aux données du webService Caisses regionales
 * 
 * @author rjansem
 *
 */
@Service
public class CaissesRegionalesServices {

	private static final String PARAM_CODEPOSTAL = "?codePostal=";

	@Value("${env.api.urlCaissesRegionales}")
	private String url;

	public CaisseRegionale getCaisseRegionaleByCodePostal(String codePostal) {
		RestTemplate restTemplate = new RestTemplate();

		String fullUrl = url + PARAM_CODEPOSTAL + codePostal;
		ResponseEntity<CaisseRegionale> entity = restTemplate.getForEntity(fullUrl, CaisseRegionale.class);

		return entity.getBody();
	}
}
