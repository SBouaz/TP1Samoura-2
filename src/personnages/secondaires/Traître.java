package personnages.secondaires;
import personnages.principaux.Commercant;
import personnages.principaux.Samouraï;
import personnages.Humain;
public class Traître extends Samouraï {
	private int niveau;
	public Traître(String nom,int argent , String boisson , String seigneur) {
		super(nom,argent,boisson,seigneur);
		this.niveau=0;
		
	} public void extorquer(Commercant c) {
		if(this.niveau<3) {
        int argentPris = c.getArgent();
        c.perdreArgent(argentPris);
        this.gagnerArgent(argentPris);
        this.niveau+= 1;
        parler("J'ai extorqué " + argentPris + " euros du commerçant " + c.getNom() + ". Ma réputation est maintenant de " + this.niveau + ".");
		}
		else {
			parler("Je peux m'extorquer car mon niveau est superieure a 3 donc mon niveau "+this.niveau);
		}
    }
	@Override
    public void direBonjour() {
        super.direBonjour();
        parler(" mon niveau actuel de traîtrise est"+this.niveau);
    }

	public void faireLeGentil(Humain h, int montant) {
        if (montant > this.getArgent()) {
            parler("Je n'ai pas assez d'argent pour faire ce don.");
            return;
        }
        
        this.perdreArgent(montant);
        h.gagnerArgent(montant);
        this.niveau-= (montant / 10.0);
        if (this.niveau< 0) {
            this.niveau = 0;
        }
        parler("Je fais ami-ami avec " + h.getNom() + " en lui donnant " + montant + " euros. Mon niveau de traîtrise est maintenant de " + this.niveau + ".");
    }
}
