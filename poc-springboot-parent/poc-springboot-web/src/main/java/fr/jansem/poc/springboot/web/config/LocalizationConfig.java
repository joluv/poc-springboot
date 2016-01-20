package fr.jansem.poc.springboot.web.config;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Configuration de l'internationalisation
 *
 * @author ntakpe_j
 */
@Configuration
public class LocalizationConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(LocalizationConfig.class);

	private static final String BUNDLE_ENCODING = "UTF-8";

	private static final int CACHE_RETENTION = 10;

	/**
	 * Configuration d'une source de messages actualisées toutes les 10 secondes
	 * dans les environnements de développement
	 *
	 * @return la source de messages
	 */
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		String[] fileNames = LocalizationBundles.getAllFileNames();
		messageSource.setBasenames(fileNames);
		messageSource.setCacheSeconds(CACHE_RETENTION);
		messageSource.setDefaultEncoding(BUNDLE_ENCODING);
		LOGGER.trace("Chargement des bundles de messages {}", Arrays.toString(fileNames));
		return messageSource;
	}

	/**
	 * Enumération des différents bundles de messages
	 */
	public enum LocalizationBundles {

		GUI_LABELS("gui-labels");

		private static final String LOCALIZATION_PREFIX = "classpath:/localization/";

		private final String fileName;

		/**
		 * Constructeur
		 *
		 * @param fileName
		 *            nom du fichier d'i18n
		 */
		LocalizationBundles(String fileName) {
			this.fileName = fileName;
		}

		/**
		 * Récupère la liste des chemins vers les bundles de messages
		 *
		 * @return tableau contenant les chemins des bundles
		 */
		public static String[] getAllFileNames() {
			LocalizationBundles[] values = values();
			String[] fileNames = new String[values.length];
			for (int i = 0; i < values.length; i++) {
				fileNames[i] = LOCALIZATION_PREFIX + values[i].fileName;
			}
			return fileNames;
		}
	}

}
