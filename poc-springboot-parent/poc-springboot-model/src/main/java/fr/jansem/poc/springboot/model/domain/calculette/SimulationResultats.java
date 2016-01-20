package fr.jansem.poc.springboot.model.domain.calculette;

import java.math.BigDecimal;

/**
 * Objet contenant les informations résultantes d'une simulation
 * 
 * @author rjansem
 *
 */
public class SimulationResultats {

	private BigDecimal montantEnprunt;
	private Integer dureePretMois;
	private BigDecimal mensualiteHorsAssurance;
	private BigDecimal taegFixe;
	private BigDecimal montantTotalDuHorsAssurance;
	private BigDecimal montantTotalInterets;
	private BigDecimal tauxDebiteurFixe;
	private BigDecimal mensualiteAssurance;
	private BigDecimal coutTotalAssurance;
	private BigDecimal tauxNominalAssurance;
	private BigDecimal taea;

	public BigDecimal getMontantEnprunt() {
		return montantEnprunt;
	}

	public void setMontantEnprunt(BigDecimal montantEnprunt) {
		this.montantEnprunt = montantEnprunt;
	}

	public Integer getDureePretMois() {
		return dureePretMois;
	}

	public void setDureePretMois(Integer dureePretMois) {
		this.dureePretMois = dureePretMois;
	}

	public BigDecimal getMensualiteHorsAssurance() {
		return mensualiteHorsAssurance;
	}

	public void setMensualiteHorsAssurance(BigDecimal mensualiteHorsAssurance) {
		this.mensualiteHorsAssurance = mensualiteHorsAssurance;
	}

	public BigDecimal getTaegFixe() {
		return taegFixe;
	}

	public void setTaegFixe(BigDecimal taegFixe) {
		this.taegFixe = taegFixe;
	}

	public BigDecimal getMontantTotalDuHorsAssurance() {
		return montantTotalDuHorsAssurance;
	}

	public void setMontantTotalDuHorsAssurance(BigDecimal montantTotalDuHorsAssurance) {
		this.montantTotalDuHorsAssurance = montantTotalDuHorsAssurance;
	}

	public BigDecimal getMontantTotalInterets() {
		return montantTotalInterets;
	}

	public void setMontantTotalInterets(BigDecimal montantTotalInterets) {
		this.montantTotalInterets = montantTotalInterets;
	}

	public BigDecimal getTauxDebiteurFixe() {
		return tauxDebiteurFixe;
	}

	public void setTauxDebiteurFixe(BigDecimal tauxDebiteurFixe) {
		this.tauxDebiteurFixe = tauxDebiteurFixe;
	}

	public BigDecimal getMensualiteAssurance() {
		return mensualiteAssurance;
	}

	public void setMensualiteAssurance(BigDecimal mensualiteAssurance) {
		this.mensualiteAssurance = mensualiteAssurance;
	}

	public BigDecimal getCoutTotalAssurance() {
		return coutTotalAssurance;
	}

	public void setCoutTotalAssurance(BigDecimal coutTotalAssurance) {
		this.coutTotalAssurance = coutTotalAssurance;
	}

	public BigDecimal getTauxNominalAssurance() {
		return tauxNominalAssurance;
	}

	public void setTauxNominalAssurance(BigDecimal tauxNominalAssurance) {
		this.tauxNominalAssurance = tauxNominalAssurance;
	}

	public BigDecimal getTaea() {
		return taea;
	}

	public void setTaea(BigDecimal taea) {
		this.taea = taea;
	}

}
