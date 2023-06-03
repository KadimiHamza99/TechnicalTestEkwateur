package io.kadev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.kadev.models.Client;
import io.kadev.models.Facture;
import io.kadev.models.Particulier;
import io.kadev.models.Pro;
import io.kadev.services.MyService;

public class FactureEkwateur {

	public static void main(String[] args) {
		MyService service = new MyService();
		//Creation de 3 clients de teste (Particulier, entreprise avec ca >, entreprise avec ca <)
		List<Client> listeClients = Arrays.asList(
							new Particulier("Monsieur", "KADIMI", "Hamza", 244.2, 153.3),
							new Pro("81781779879823","ENTREPRISE1",892000,876.98,8738.29),
							new Pro("29298392839202","ENTREPRISE2",15100000,18761.98,18738.29)
						);
		//Cette Map va contenir chaque client avec sa facture pour le mois
		Map<Client, Facture> factures = new HashMap<Client,Facture>();
		for (Client client : listeClients) {
			Facture facture = service.genererFacture(client);
			factures.put(client, facture);
			//Affichage sur la console
			System.out.println("\n-------------FACTURE CLIENT-------------\n");
			System.out.println("Reference du client : " + client.getReferenceClient());
			System.out.println("Consommation GAZ : " + client.getConsommationGaz());
			System.out.println("Consommation ELECTRICITE : " + client.getConsommationElectricite());
			System.out.println("Total à payer : "+ facture.getMontant());
			//Renitialiser la consommation à 0
			client.setConsommationElectricite(0);
			client.setConsommationGaz(0);
		}
		
		
		
	}

}
