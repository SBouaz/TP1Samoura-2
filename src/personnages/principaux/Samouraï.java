package personnages.principaux;


public class Samouraï extends Ronin {
  private String seigneur;
  public Samouraï(String nom,int argent , String boisson , String seigneur) {
	  super(nom,argent,boisson);
	  this.seigneur=seigneur;
  }
  public void direBonjour() {
      super.direBonjour();
      parler("Je sers le seigneur " + this.seigneur + ".");
  }
  public void boire(String boisson) {
      parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
  }
}
