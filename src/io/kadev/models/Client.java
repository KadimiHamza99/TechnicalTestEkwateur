package io.kadev.models;

import java.util.Random;


public abstract class Client {
	
	private String referenceClient;
	private double consommationGaz;
	private double consommationElectricite;
	
	public Client(double gaz, double elect) {
		super();
		this.referenceClient = "EKW"+this.generateRandomNumber();
		this.consommationElectricite = elect;
		this.consommationGaz = gaz;
	}
	
	public double getConsommationGaz() {
		return consommationGaz;
	}

	public void setConsommationGaz(double consommationGaz) {
		this.consommationGaz = consommationGaz;
	}

	public double getConsommationElectricite() {
		return consommationElectricite;
	}

	public void setConsommationElectricite(double consommationElectricite) {
		this.consommationElectricite = consommationElectricite;
	}

	
	public String getReferenceClient() {
		return referenceClient;
	}
	public void setReferenceClient(String referenceClient) {
		this.referenceClient = referenceClient;
	}
	/*
	 * Cette fonction nous aide à générer des Références pour les clients, elle génére des nombres
	 * de 8 chiffres.
	 * */
	private long generateRandomNumber() {
        Random random = new Random();
        long randomNumber = 10000000L + random.nextInt(90000000);
        return randomNumber;
    }
	
}
