package dev.entity;

public class BureauCommercial extends Bureau {
	public BureauCommercial(){
		super();
	}
	
	
	public BureauCommercial(int reseau, int secteur, int tel, int chaises, int tables, int personnes) {
		super(reseau, secteur, tel, chaises, tables, personnes);
		
	}


	public int tauxEspaceDispo(){
		return  ((this.getReseau() + this.getSecteur() + (2*this.getTel())+ (2*this.getChaises()) + this.getTables())/this.getPersonnes());
			    
	}
}
