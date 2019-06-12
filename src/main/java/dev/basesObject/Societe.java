package dev.basesObject;

import java.util.Scanner;

import dev.entity.Bureau;
import dev.entity.BureauCommercial;
import dev.entity.BureauDeveloppeur;

public class Societe {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ajouter 3 bureaux commerciaux
		Bureau commBureau_1 = new BureauCommercial(1, 1, 2, 2, 1, 3);

		Bureau commBureau_2 = new BureauCommercial(1, 1, 1, 1, 1, 4);

		Bureau commBureau_3 = new BureauCommercial(1, 1, 3, 2, 1, 5);

		// 2 bureaux developpeurs
		Bureau devBureau_1 = new BureauDeveloppeur(1, 1, 2, 2, 1, 2);

		Bureau devBureau_2 = new BureauDeveloppeur(1, 1, 3, 2, 1, 5);

		System.out.println("Give a number between 5 and 15");
		int num = Integer.parseInt(scan.next());
		 int numComm = 0;
		 int numDev = 0;
		 int generalTaux = 0;
		for (int i = 0; i <= num; i++) {
			if (i == num) {
				System.out.println("Space limited, existing loop");
				break;
			} else if (i < num) {
             devBureau_2.setPersonnes(devBureau_2.getPersonnes()+i);
             //A chaque itération, afficher le nombre de commerciaux.
             numComm = commBureau_1.getPersonnes() + commBureau_2.getPersonnes()+ commBureau_3.getPersonnes();
             System.out.println(numComm);
          //  afficher le nombre de développeurs 
             numDev = devBureau_1.getPersonnes() + devBureau_2.getPersonnes();
             System.out.println(numDev);
             
             //le taux d'espace dispo de chaque bureau et le taux général de la société en appelant tauxespacedispo()
            
             //afficher le nombre de taux Commerciaux.
             System.out.println(commBureau_1.tauxEspaceDispo());
             System.out.println(commBureau_2.tauxEspaceDispo());
             System.out.println(commBureau_3.tauxEspaceDispo());
             
           //afficher le nombre de taux developpeur.
             System.out.println(devBureau_1.tauxEspaceDispo());
             System.out.println(devBureau_2.tauxEspaceDispo());
             
           //afficher le nombre de taux en general.
             generalTaux = ((Bureau)(commBureau_1)).tauxEspaceDispo() + 
            		 ((Bureau)(commBureau_2)).tauxEspaceDispo() +
            		 ((Bureau)(commBureau_3)).tauxEspaceDispo() + 
            		 ((Bureau)(devBureau_1)).tauxEspaceDispo() +
            		 ((Bureau)(devBureau_2)).tauxEspaceDispo();
             
             System.out.println(generalTaux);
			}
		}
	}

}
