package personnages.secondaires;
import java.util.Random;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samouraï;
import personnages.principaux.Yakuza;
import personnages.Humain;
import personnages.secondaires.Traître;
public class Grandmère  extends Humain{
	
	private Humain [] memoire = new Humain [30];  
	private int nbHumainsConnus = 0;
	
	public Grandmère(String nom, int argent) {
        super(nom, argent, "tisane");
    }

	private String humainHasard(Random rand) {
        int hasard = rand.nextInt(4); 
        switch (hasard) {
            case 0:
                return "Commercant";
            case 1:
                return "Ronin";
            case 2:
                return "Samourai";
            case 3:
                return "Yakuza";
            default:
                return "Humain";  
        }
    }
	public void faireConnaissanceAvec(Humain humain) {
        if (nbHumainsConnus < memoire.length) {
            memoire[nbHumainsConnus] = humain;
            nbHumainsConnus++;
            parler("Enchantée de faire votre connaissance, " + humain.getNom() + "!");
        } else {
            parler("Je ne peux plus me souvenir de nouvelles personnes !");
        }
	}
	public void ragoter() {
        Random rand = new Random();
        for (int i = 0; i < nbHumainsConnus; i++) {
            Humain humain = memoire[i];
            if (humain instanceof Traître) {
                parler("Je sais que " + humain.getNom() + " est un traître !");
            } else {
                String type = humainHasard(rand);
                parler("Je crois que " + humain.getNom() + " est un " + type + ".");
            }
        }
    }
}
