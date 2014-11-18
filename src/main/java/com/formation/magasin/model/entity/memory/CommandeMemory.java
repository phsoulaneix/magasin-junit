package com.formation.magasin.model.entity.memory;

import java.util.List;

import com.formation.magasin.model.entity.Client;
import com.formation.magasin.model.entity.Commande;
import com.formation.magasin.model.entity.LigneCommande;

/**
 * The Class Compte.
 */
public class CommandeMemory extends Commande {

	/** Liste des lignes de la commande. */
	private List<LigneCommande> lignesCommande;

	/** Le client. */
	private Client client;
}
