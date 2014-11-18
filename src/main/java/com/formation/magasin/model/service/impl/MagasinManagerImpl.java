package com.formation.magasin.model.service.impl;

import java.util.List;

import com.formation.magasin.model.dao.ArticleDAO;
import com.formation.magasin.model.dao.ClientDAO;
import com.formation.magasin.model.dao.CommandeDAO;
import com.formation.magasin.model.dao.LigneCommandeDAO;
import com.formation.magasin.model.entity.Client;
import com.formation.magasin.model.entity.Commande;
import com.formation.magasin.model.service.MagasinManager;

/**
 * The Class BanqueManagerImpl.
 */
public class MagasinManagerImpl implements MagasinManager {

	/** The client dao. */
	private final ClientDAO clientDao;

	/** The compte dao. */
	private final CommandeDAO commandeDao;

	/** The argent dao. */
	private final ArticleDAO articleDao;

	/** The ligne commande dao. */
	private final LigneCommandeDAO ligneCommandeDao;

	/**
	 * Instantiates a new banque manager impl.
	 *
	 * @param clientDao
	 *            the client dao
	 * @param compteDao
	 *            the compte dao
	 * @param argentDao
	 *            the argent dao
	 * @param ligneCommandeDao
	 *            the ligne commande dao
	 */
	public MagasinManagerImpl(ClientDAO clientDao, CommandeDAO compteDao,
			ArticleDAO argentDao, LigneCommandeDAO ligneCommandeDao) {
		super();
		this.clientDao = clientDao;
		this.commandeDao = compteDao;
		this.articleDao = argentDao;
		this.ligneCommandeDao = ligneCommandeDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.formation.banque.model.service.MagasinManager#addCommande(com.formation
	 * .banque.model.entity.Commande)
	 */
	@Override
	public Boolean addCommande(Commande commande) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.service.MagasinManager#listCommmande()
	 */
	@Override
	public List<Commande> listCommmande() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.formation.banque.model.service.MagasinManager#listCommandeByClient
	 * (com.formation.banque.model.entity.Client)
	 */
	@Override
	public List<Commande> listCommandeByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.formation.banque.model.service.MagasinManager#lastCommandeByClient
	 * (com.formation.banque.model.entity.Client)
	 */
	@Override
	public Commande lastCommandeByClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.formation.banque.model.service.MagasinManager#removeCommande(com.
	 * formation.banque.model.entity.Commande)
	 */
	@Override
	public Boolean removeCommande(Commande commande) {
		// TODO Auto-generated method stub
		return null;
	}

}
