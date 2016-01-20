package fr.jansem.poc.springboot.api.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import fr.jansem.poc.springboot.model.domain.caisses.CaisseRegionale;

/**
 * Service de gestion des caisses régionales par département
 * 
 * @author rjansem
 *
 */
@Service
public class CaissesRegionalesService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CaissesRegionalesService.class);

	@Value("${env.caissesRegFileLocation}")
	private String csvLocation;
	
	private Map<String, CaisseRegionale> mapCaisses;
	
	

	@PostConstruct
	public void init() throws IOException {
		mapCaisses = new HashMap<String, CaisseRegionale>();

		Path path = Paths.get(csvLocation);
		try (Stream<String> lines = Files.lines(path)) {
			List<String> linesList = lines.collect(Collectors.toList());
			Iterator<String> ite = linesList.iterator();

			// On ne prend pas en compte la ligne des titres.
			ite.next();
			while (ite.hasNext()) {
				String line = ite.next();
				String[] tokens = line.split(";");
				mapCaisses.put(tokens[0], new CaisseRegionale(tokens[3], tokens[2]));
			}
			LOGGER.info("Caisses régionales chargées depuis le fichier");
		}
	}
	
	public CaisseRegionale getCaisseRegionaleByCodePostal(String codePostal) {
		String numDept = codePostal.substring(0, 2);
		LOGGER.debug("Code département : {}", numDept);

		CaisseRegionale caisse = mapCaisses.get(numDept);
		if (null != caisse) {
			return caisse;
		}

		throw new IllegalArgumentException("Code postal incorrect");
	}
}
