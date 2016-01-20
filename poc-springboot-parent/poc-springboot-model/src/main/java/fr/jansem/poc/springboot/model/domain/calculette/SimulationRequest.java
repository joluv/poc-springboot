package fr.jansem.poc.springboot.model.domain.calculette;

import java.math.BigDecimal;

/**
 * Objet domaine de demande de simulation
 * 
 * @author rjansem
 *
 */
public class SimulationRequest {

	private BigDecimal montantPret;
	private Integer dureePretMois;
	private BigDecimal tauxAssurance;
	private BigDecimal tauxPret;

	public BigDecimal getMontantPret() {
		return montantPret;
	}

	public void setMontantPret(BigDecimal montantPret) {
		this.montantPret = montantPret;
	}

	public Integer getDureePretMois() {
		return dureePretMois;
	}

	public void setDureePretMois(Integer dureePretMois) {
		this.dureePretMois = dureePretMois;
	}

	public BigDecimal getTauxAssurance() {
		return tauxAssurance;
	}

	public void setTauxAssurance(BigDecimal tauxAssurance) {
		this.tauxAssurance = tauxAssurance;
	}

	public BigDecimal getTauxPret() {
		return tauxPret;
	}

	public void setTauxPret(BigDecimal tauxPret) {
		this.tauxPret = tauxPret;
	}

}
