package fr.jansem.poc.springboot.web.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.jansem.poc.springboot.model.domain.Personne;

/**
 * Service métier d'appel aux données du webService Personne
 * 
 * @author rjansem
 *
 */
@Service
public class PersonneService {

	@Value("${env.api.urlPersonne}")
	private String url;

	public Personne getPersonne() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Personne> entity = restTemplate.getForEntity(url, Personne.class);

		return entity.getBody();
	}
}
