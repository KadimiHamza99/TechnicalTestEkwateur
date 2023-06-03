package io.kadev.services;

import java.util.HashMap;
import java.util.Map;

import io.kadev.models.Client;
import io.kadev.models.Facture;
import io.kadev.models.Particulier;
import io.kadev.models.Pro;

public class MyService {
	
	public Facture genererFacture(Client client) {
		Map<String,Double> tarif = obtenirFacturation(client);
		
		double montant = 0.0;
		double consommationGaz = client.getConsommationGaz();
		double consommationElectricite = client.getConsommationElectricite();
		double prixGaz = tarif.get("gaz");
		double prixElectricite = tarif.get("electricite");
		
		montant = consommationElectricite*prixElectricite + consommationGaz*prixGaz;
		
		return new Facture(montant,client);
	}
	
	/*
	 * Cette fonction retourne une map contenant les tarifs qu'on doit respecter pour chaque type 
	 * de client
	 * */
	private Map<String, Double> obtenirFacturation(Client client){
		Map<String, Double> facturation = new HashMap<String, Double>();
		if(client instanceof Particulier) {
			facturation.put("gaz", 0.115);
			facturation.put("electricite", 0.121);
		}else if(client instanceof Pro) {
			if(((Pro) client).getCa()>1000000) {
				facturation.put("gaz", 0.111);
				facturation.put("electricite", 0.114);
			}else {
				facturation.put("gaz", 0.113);
				facturation.put("electricite", 0.118);
			}
		}
		return facturation;
	}
	
}
