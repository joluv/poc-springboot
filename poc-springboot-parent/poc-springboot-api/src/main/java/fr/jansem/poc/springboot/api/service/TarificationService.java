package fr.jansem.poc.springboot.api.service;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import au.com.bytecode.opencsv.CSVReader;
import fr.jansem.poc.springboot.model.domain.tarification.Tarification;

/**
 * Service de gestion des tarifs de simulation
 * 
 * @author rjansem
 *
 */
@Service
public class TarificationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TarificationService.class);

	@Value("${env.tarificationFileLocation}")
	private String csvLocation;

	private List<Tarification> listeTarifs;

	@PostConstruct
	public void init() throws IOException {
		listeTarifs = new ArrayList<Tarification>();

		final DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");

		try (CSVReader reader = new CSVReader(new FileReader(csvLocation), ';');) {
			String[] nextLine;
			reader.readNext();
			while ((nextLine = reader.readNext()) != null) {
				Tarification tarif = new Tarification();
				tarif.setIdCaisseRegionale(nextLine[0]);
				tarif.setIdProduit(nextLine[1]);
				tarif.setTauxCredit(new BigDecimal(cleanupCommaAmount(nextLine[2])));
				tarif.setTauxAssurance(new BigDecimal(cleanupCommaAmount(nextLine[3])));
				tarif.setMontantMin(new BigDecimal(cleanupCommaAmount(nextLine[4])));
				tarif.setMontantMax(new BigDecimal(cleanupCommaAmount(nextLine[5])));
				tarif.setDateValidite(LocalDate.parse(nextLine[6], format));
				tarif.setDateFinValidite(LocalDate.parse(nextLine[7], format));
				tarif.setDureeMin(new Integer(nextLine[8]));
				tarif.setDureeMax(new Integer(nextLine[9]));
				tarif.setFrais(new BigDecimal(cleanupCommaAmount(nextLine[10])));
				tarif.setMontantAfficheDefaut(new BigDecimal(cleanupCommaAmount(nextLine[11])));
				tarif.setPasMontant(new BigDecimal(cleanupCommaAmount(nextLine[12])));
				tarif.setPasDuree(new Integer(nextLine[13]));

				listeTarifs.add(tarif);
			}
		}
	}

	/**
	 * Récupère le tarif en fonction de la caisse régionale et du produit
	 * 
	 * @param idCaisse
	 * @param idProduit
	 * @return
	 */
	public Optional<Tarification> getTarificationByIdCaisseAndIdProduit(String idCaisse, String idProduit) {
		return listeTarifs.stream()
				.filter(t -> idCaisse.equals(t.getIdCaisseRegionale()) && idProduit.equals(t.getIdProduit()))
				.findFirst();
	}

	private String cleanupCommaAmount(String amount) {
		return StringUtils.replace(amount, ",", ".");
	}
}
