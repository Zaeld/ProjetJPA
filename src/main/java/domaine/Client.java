package domaine;

import java.util.List;

public class Client {
	private Integer idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String email;
	private String telephone;
	private Integer idConseiller;
	private Conseiller conseiller;
	private List<CompteBancaire> listCompte;


public Client() {
	super();
	this.nom = "Entrez votre nom";
	this.prenom = "Entrez votre prenom";
	this.adresse = "Entrez votre adresse";
	this.codePostal = "Entrez votre Code Postal";
	this.ville = "Entrez votre ville";
	this.email = "Entrez votre email";
	this.telephone = "Entrez votre téléphone";
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getIdClient() {
	return idClient;
}
public String getCodePostal() {
	return codePostal;
}

public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public Integer getIdConseiller() {
	return idConseiller;
}

public void setIdConseiller(Integer idConseiller) {
	this.idConseiller = idConseiller;
}

public void setIdClient(Integer idClient) {
	this.idClient = idClient;
}

public void setIdClient(int idClient) {
	this.idClient = idClient;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public String getPrenom() {
	return prenom;
}



public void setPrenom(String prenom) {
	this.prenom = prenom;
}

}
