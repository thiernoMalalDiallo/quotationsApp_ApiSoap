package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable{

	private String nom;
	private String prenom;
	private String pseudo;
	
	public User() {
	}
	
	public User(String nom, String prenom, String pseudo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
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
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
}
