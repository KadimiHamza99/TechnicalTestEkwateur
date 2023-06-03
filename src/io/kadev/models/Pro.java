package io.kadev.models;

public class Pro extends Client{
	
	private String numSiret;
	private String raisonSociale;
	private double ca;
	
	public Pro(String numSiret, String raisonSociale, double ca, double gaz, double elect) {
		super(gaz,elect);
		this.numSiret = numSiret;
		this.raisonSociale = raisonSociale;
		this.ca = ca;
	}

	public String getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(String numSiret) {
		this.numSiret = numSiret;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		this.ca = ca;
	}

}
