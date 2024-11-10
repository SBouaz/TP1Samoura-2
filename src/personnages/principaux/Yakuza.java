package personnages.principaux;
import personnages.Humain;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson);
        this.clan = clan;
        this.reputation = 0;
    }

    public String getClan() {
        return this.clan;
    }

    public int getReputation() {
        return this.reputation;
    }

    public void extorquer(Commercant c) {
        int argentPris = c.getArgent();
        c.perdreArgent(argentPris);
        this.gagnerArgent(argentPris);
        this.reputation += 1;
        parler("J'ai extorqué " + argentPris + " euros du commerçant " + c.getNom() + ". Ma réputation est maintenant de " + this.reputation + ".");
    }

    public int perdreDuel() {
        int argentPerdu = this.getArgent();
        this.perdreArgent(argentPerdu);
        this.reputation -= 1;
        parler("J'ai perdu un duel et tout mon argent. Ma réputation est maintenant de " + this.reputation + ".");
        return argentPerdu;
    }

    public void gagnerDuel() {
        this.reputation += 1;
        parler("J'ai gagné un duel. Ma réputation est maintenant de " + this.reputation + ".");
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("J'appartiens au clan " + this.clan + " avec une réputation de " + this.reputation + ".");
    }
}