package mescomplexe;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// création de nombres complexes
		Complexe z1 = new Complexe();
		Complexe z2 = new Complexe(2,3);
		
		z1.affiche();
		z2.affiche();
		// exemples d'utilisation
		z1.addition(z2); // z1 est modifié par l'addion
		
		Complexe z3;
		z3 = z1.addition2(z2) ; // z1 et Z2 ne sont pas affectués par l'additios
		z3.affiche();
		
		//fonction static applée non pas sur une instante mais sur la classe elle même
		z3 = Complexe.addition2(z1, z2);
		// versions 1/transpose 
		z1.transpose();
		z1.affiche();
		
		//versions 1: Transpose le complexe sur le quel elle s'appplique
		Complexe z4;
		z4 = z1.transpose2();
		z4.affiche();
		
		System.out.println("---------------exo3---------\n");
		//Exercise 3 sur les référence
		Complexe c1 = new Complexe(2,3);
		Complexe c2 = new Complexe(5, -2);
		Complexe c3 = new Complexe(0, -1);
		
		c3 = c1;
		c1.affiche("c1"); c2.affiche("c2"); c3.affiche("c3");
		
		System.out.println("\n après modification de c1");
		c1.partieReelle = c1.partieReelle* - 1;
		c1.affiche("c1"); c2.affiche("c2"); c3.affiche("c3");
		
		System.out.println("\n après modificationde c2 à c1");
		c2 = c1;
		c1.affiche("c1"); c2.affiche("c2"); c3.affiche("c3");
		
		Complexe c4 = new Complexe(1,2);
		Complexe c5 = new Complexe(1,2);
		
		if (c4 == c5) {
			System.out.println("\n les deux complexe sont identiques");
		}
		else { System.out.println("les deux complex sont différents");
		}
		if (c4.egale(c5)) {
			System.out.println("\n les deux complexe sont identiques");
		}
		else { System.out.println("les deux complex sont différents");
		}
		
	}

}

