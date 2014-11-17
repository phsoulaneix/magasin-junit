package com.formation.banque.model.service;

import java.util.List;

import com.formation.banque.model.entity.Client;
import com.formation.banque.model.entity.Commande;

/**
 * The Interface MagasinManager.
 */
public interface MagasinManager {

	/**
	 * Adds the commande.
	 *
	 * @param commande
	 *            the commande
	 * @return the boolean
	 */
	public Boolean addCommande(Commande commande);

	/**
	 * List commmande.
	 *
	 * @return the list
	 */
	public List<Commande> listCommmande();

	/**
	 * List commande by client.
	 *
	 * @param client
	 *            the client
	 * @return the list
	 */
	public List<Commande> listCommandeByClient(Client client);

	/**
	 * Last commande by client.
	 *
	 * @param client
	 *            the client
	 * @return the commande
	 */
	public Commande lastCommandeByClient(Client client);

	/**
	 * Removes the commande.
	 *
	 * @param commande
	 *            the commande
	 * @return the boolean
	 */
	public Boolean removeCommande(Commande commande);

}
