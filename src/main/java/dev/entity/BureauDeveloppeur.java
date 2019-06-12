package dev.entity;

public class BureauDeveloppeur extends Bureau {
	public BureauDeveloppeur(){
		super();
	}
	
	
	public BureauDeveloppeur(int reseau, int secteur, int tel, int chaises, int tables, int personnes) {
		super(reseau, secteur, tel, chaises, tables, personnes);
		
	}


	public int tauxEspaceDispo(){
		return  (((3*this.getReseau()) + (3*this.getSecteur()) + this.getTel()+ ((int)(1.5*this.getChaises())) + this.getTables())/this.getPersonnes());
			    
	}
	
}
