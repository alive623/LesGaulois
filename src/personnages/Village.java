package personnages;

public class Village {
	private Gaulois[] villageois;
	private  int nbvillageois = 0;
	private String nom;
	private Chef chef;
	
	public Village(String nom,int nbvillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbvillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois  gauloisAAjouter) {
		if (nbvillageois < villageois.length){
			villageois[nbvillageois] = gauloisAAjouter;
				nbvillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		Gaulois gaulois =villageois[numVillageois];
		 return gaulois;
	}
	
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	
	public String getNom() {
	return nom;
	}
	public static void main(String[] args) {
		
	}
}
