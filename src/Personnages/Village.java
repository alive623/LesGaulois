package Personnages;

public class Village {
	private Gaulois[] villageois;
	private  int nbvillageois = 0;
	private String nom;
	private Chef chef;
	
	public Village(String nom,int nbvillageoisMaximum) {
	this.nom = nom;
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	public String getNom() {
	return nom;
	}
}
