package mescomplexe;

public class Complexe {
	
	// attributs
	float partieReelle;
	float partieImaginaire;
	
	// constructeurs
	public Complexe() {
		this.partieImaginaire=0;
		this.partieReelle=0;
	}
	
	public Complexe (float pr, float pi) {
		this.partieImaginaire=pi;
		this.partieReelle=pr;
	}
	
	// fonctions
	
	// affichage du complexe
	public void affiche() {
		System.out.println("Valeur du complexe z = " + this.partieReelle + " + " 
	                                                + this.partieImaginaire + "i");
		
	}
	public void affiche(String nomDuComplexe) {
		System.out.println("Valeur du complexe z = " + this.partieReelle + " + " 
	                                                + this.partieImaginaire + "i");
	}	
	//surcharge de méthode à condition de faire le type 
	public void addition(Complexe autre) 
					{
					this.partieImaginaire = this.partieImaginaire + autre.partieImaginaire;
					this.partieReelle = this.partieReelle + autre.partieReelle;
					this.affiche();
					}
	
		// retourne le nouveau Complexe
	public Complexe addition2(Complexe autre) {
		Complexe z = new Complexe();
		z.partieImaginaire = this.partieImaginaire + autre.partieImaginaire;
		z.partieReelle = this.partieReelle + autre.partieReelle;
		return z;
		}
	
	public static Complexe addition2(Complexe z1, Complexe z2) {
		Complexe z = new Complexe ();
		z.partieImaginaire = z1.partieImaginaire + z2.partieImaginaire;
		z.partieReelle = z1.partieReelle + z2.partieReelle;
		return z;
	}
	//fonction qui me transpose
	public void transpose() {
			this.partieImaginaire = this.partieImaginaire* - 1;		
	}
	
	//fonction qui retourne la transpose de moi
	public Complexe transpose2() {
		Complexe z = new Complexe(this.partieReelle, (this.partieImaginaire* - 1));
		return z;
	
	
	}
	
	public boolean egale(Complexe autre) {
		boolean res = false;
		if ((this.partieReelle == autre.partieReelle) && (this.partieImaginaire == autre.partieImaginaire)) {
			//ils sonr=t égaux
			res = true; //on retourne vrai
		}
	return res;

	}


}

