package jpa;

import domaine.Client;

public class ClientDao extends JpaDao<Client> {

	public void create(Client client) {

	}

	@Override
	public Client read(Integer id) {
		return this.read(Client.class, id);
	}

	public void update(Client client) {

	}

	public void delete(Integer id) {
	}

	// public List<Client> getAllClient(Conseiller c) {
	// return this.em.createNamedQuery("getClients", Client.class)
	// .setParameter("idConseiller", c.getIdConseiller())
	// .getResultList();
	// }

}
