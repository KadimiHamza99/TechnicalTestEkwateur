package io.kadev.models;

public class Facture {
	
	private double montant;
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Facture(double montant, Client client) {
		this.montant = montant;
		this.client = client;
	}
	
}
