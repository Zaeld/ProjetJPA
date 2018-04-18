package service;

import domaine.Client;
import jpa.ClientDao;

/**
 * @author Stagiaire
 *
 */
public class ClientService {

	// La classe ClientService permet de faire le lien entre la couche présentation
	// et la classe ClientDAO

	// Déclaration
	ClientDao dao = new ClientDao();

	public void create(Client client) {
		dao.create(client);
	}

	public Client read(Integer id) {
		return dao.read(Client.class, id);
	}

	public void update(Client client) {
		dao.update(client);
	}

	public void delete(Integer id) {
		dao.delete(id);
	}

}
