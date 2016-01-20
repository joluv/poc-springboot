package fr.jansem.poc.springboot.model.domain.caisses;

/**
 * Objet domaine représentant une caisse regionale
 * 
 * @author rjansem
 *
 */
public class CaisseRegionale {
	private String nom;
	private String region;

	public CaisseRegionale(String nom, String region) {
		super();
		this.nom = nom;
		this.region = region;
	}

	public CaisseRegionale() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
