package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain {
    public Commercant(String nom, int argent) {
        super(nom, argent, "the");
    }
    public int seFaireExtorquer() {
    	int argentperdu=getArgent();
    	
    	perdreArgent(argentperdu);
    	parler("le monde est vraiment trop injuste");
    	return argentperdu;
    }
    public  void recevoir(int argent) {
    	gagnerArgent(argent);
    	parler("Merci pour votre générosité !");
    }
   
}