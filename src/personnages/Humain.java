package personnages;

public class Humain {
	private String nom;
    private int argent;
    private String boisson;

    public Humain(String nom, int argent, String boisson) {
        this.nom = nom;
        this.argent = argent;
        this.boisson = boisson;
    }

    public void parler(String texte) {
        System.out.println("(" + this.nom + ") - " + texte);
    }

    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boisson + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
    }

    public String getNom() {
        return this.nom;
    }

    public String getBoisson() {
        return this.boisson;
    }

    public int getArgent() {
        return this.argent;
    }

    public void gagnerArgent(int n) {
        this.argent += n;
        parler("J'ai gagné " + n + " euros. Maintenant j'ai " + this.argent + " euros.");
    }

    public void perdreArgent(int n) {
        this.argent -= n;
        parler("J'ai perdu " + n + " euros. Maintenant il me reste " + this.argent + " euros.");
    }
}
