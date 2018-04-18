package presentation;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

import domaine.Client;
import service.ClientService;

@ManagedBean(name = "newclient")
@SessionScoped
public class BeanFormulaire {
	ClientService service = new ClientService();
	private Client client = new Client();

	public BeanFormulaire() {
		super();
	}

	public void createClient() {
		service.create(client);
	}

	public Client readClient(Integer id) {
		return service.read(id);
	}

	public void updateClient(Client client) {
		service.update(client);
	}

	public void deleteClient(Integer id) {
		service.delete(id);
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
