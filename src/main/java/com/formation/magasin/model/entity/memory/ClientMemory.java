package com.formation.magasin.model.entity.memory;

import java.util.List;

import com.formation.magasin.model.entity.Client;
import com.formation.magasin.model.entity.Commande;

/**
 * The Class Client.
 */
public class ClientMemory extends Client {

	private String nom;

	private String premon;

	private List<Commande> listeCommande;
}
