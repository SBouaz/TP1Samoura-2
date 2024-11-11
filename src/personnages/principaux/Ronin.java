package personnages.principaux;
import personnages.Humain;
public class Ronin extends Humain {
	private int honneur;
	public Ronin(String nom,int argent,String boisson) {
		super(nom, argent, boisson);
		this.honneur=1;
	} 
	public void donner(int montant ,Commercant c) {
        if (this.getArgent() >= montant) {
            this.perdreArgent(montant);
            c.recevoir(montant);
            parler("J'ai donné " + montant + " à " + c.getNom() + ".");
        } else {
            parler("Je n'ai pas assez d'argent pour donner " + montant + " à " + c.getNom() + ".");
        }
    }
	public void provoquer(Yakuza y) {
        if ((this.honneur * 2) > y.getReputation()) {
            int argentGagne = y.perdreDuel();
            this.gagnerArgent(argentGagne);
            this.honneur += 1;
            parler("J'ai gagné le duel contre " + y.getNom() + " et pris " + argentGagne + " euros. Mon honneur est maintenant de " + this.honneur + ".");
        } else {
            y.gagnerDuel();
            this.honneur -= 1;
            parler("J'ai perdu le duel contre " + y.getNom() + ". Mon honneur est maintenant de " + this.honneur + ".");
        }
    }
}
