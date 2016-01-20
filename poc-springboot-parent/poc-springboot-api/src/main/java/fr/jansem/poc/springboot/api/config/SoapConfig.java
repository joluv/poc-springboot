package fr.jansem.poc.springboot.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Classe de configuration du marshaller pour l'appel des webServices SOAP
 * 
 * @author rjansem
 *
 */
@Configuration
public class SoapConfig {

	private static final String CONTEXT_PATH = "fr.jansem.poc.springboot.api.dao.calculette.bean";

	/**
	 * Instanciation du bean Spring pour le marshaller du webService
	 * CalculetteLO
	 * 
	 * @return
	 */
	@Bean
	public Jaxb2Marshaller calculetteMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(CONTEXT_PATH);
		return marshaller;
	}

}