package fr.jansem.poc.springboot.model.domain.tarification;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Objet domaine de tarification
 * 
 * @author rjansem
 *
 */
public class Tarification {
	private String idCaisseRegionale;
	private String idProduit;
	private BigDecimal tauxCredit;
	private BigDecimal tauxAssurance;
	private BigDecimal montantMin;
	private BigDecimal montantMax;
	private LocalDate dateValidite;
	private LocalDate dateFinValidite;
	private Integer dureeMin;
	private Integer dureeMax;
	private BigDecimal frais;
	private BigDecimal montantAfficheDefaut;
	private BigDecimal pasMontant;
	private Integer pasDuree;

	public String getIdCaisseRegionale() {
		return idCaisseRegionale;
	}

	public void setIdCaisseRegionale(String idCaisseRegionale) {
		this.idCaisseRegionale = idCaisseRegionale;
	}

	public String getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(String idProduit) {
		this.idProduit = idProduit;
	}

	public BigDecimal getTauxCredit() {
		return tauxCredit;
	}

	public void setTauxCredit(BigDecimal tauxCredit) {
		this.tauxCredit = tauxCredit;
	}

	public BigDecimal getTauxAssurance() {
		return tauxAssurance;
	}

	public void setTauxAssurance(BigDecimal tauxAssurance) {
		this.tauxAssurance = tauxAssurance;
	}

	public BigDecimal getMontantMin() {
		return montantMin;
	}

	public void setMontantMin(BigDecimal montantMin) {
		this.montantMin = montantMin;
	}

	public BigDecimal getMontantMax() {
		return montantMax;
	}

	public void setMontantMax(BigDecimal montantMax) {
		this.montantMax = montantMax;
	}

	public LocalDate getDateValidite() {
		return dateValidite;
	}

	// public String getFormattedDateValidite() {
	// DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	// return format.format(dateValidite);
	// }

	public void setDateValidite(LocalDate dateValidite) {
		this.dateValidite = dateValidite;
	}

	public LocalDate getDateFinValidite() {
		return dateFinValidite;
	}

	// public String getFormattedDateFinValidite() {
	// DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	// return format.format(dateFinValidite);
	// }

	public void setDateFinValidite(LocalDate dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}

	public Integer getDureeMin() {
		return dureeMin;
	}

	public void setDureeMin(Integer dureeMin) {
		this.dureeMin = dureeMin;
	}

	public Integer getDureeMax() {
		return dureeMax;
	}

	public void setDureeMax(Integer dureeMax) {
		this.dureeMax = dureeMax;
	}

	public BigDecimal getFrais() {
		return frais;
	}

	public void setFrais(BigDecimal frais) {
		this.frais = frais;
	}

	public BigDecimal getMontantAfficheDefaut() {
		return montantAfficheDefaut;
	}

	public void setMontantAfficheDefaut(BigDecimal montantAfficheDefaut) {
		this.montantAfficheDefaut = montantAfficheDefaut;
	}

	public BigDecimal getPasMontant() {
		return pasMontant;
	}

	public void setPasMontant(BigDecimal pasMontant) {
		this.pasMontant = pasMontant;
	}

	public Integer getPasDuree() {
		return pasDuree;
	}

	public void setPasDuree(Integer pasDuree) {
		this.pasDuree = pasDuree;
	}

}
