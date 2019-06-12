package dev.entity;

public class Bureau {
	
	private int reseau = 0;
	private int secteur = 0;
	private int tel = 0;
	private int chaises = 0;
	private int tables = 0 ;
	private int personnes = 1;
	
	public Bureau() {
		
	}
	/** Constructor initializing the values */
	public Bureau(int reseau, int secteur, int tel, int chaises, int tables, int personnes) {
		
		this.reseau = reseau;
		this.secteur = secteur;
		this.tel = tel;
		this.chaises = chaises;
		this.tables = tables;
		this.personnes = personnes;
	}

	/** function calculating the Space Available */
	 public int tauxEspaceDispo(){
		return (this.reseau + this.secteur + this.tel+ this.chaises + this.tables)/this.personnes;
			    
	}
	 
	// getters and setters
	public int getReseau() {
		return reseau;
	}
	public void setReseau(int reseau) {
		this.reseau = reseau;
	}
	public int getSecteur() {
		return secteur;
	}
	public void setSecteur(int secteur) {
		this.secteur = secteur;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getChaises() {
		return chaises;
	}
	public void setChaises(int chaises) {
		this.chaises = chaises;
	}
	public int getTables() {
		return tables;
	}
	public void setTables(int tables) {
		this.tables = tables;
	}
	public int getPersonnes() {
		return personnes;
	}
	public void setPersonnes(int personnes) {
		this.personnes = personnes;
	}
	@Override
	public String toString() {
		return "Bureau [reseau=" + reseau + ", secteur=" + secteur + ", tel=" + tel + ", chaises=" + chaises
				+ ", tables=" + tables + ", personnes=" + personnes + "]";
	}
	 
	 
	 
}
