

public class Ligne_Achat  {
private double quantite;
private Produit p;
public Ligne_Achat(Produit p,double qte)
{this.p=p;
this.quantite=qte;
	}
public double getQuantite() {
	return quantite;
}

public Produit getP() {
	return p;
}
public void setP(Produit p) {
	this.p = p;
}
public void setQuantite(int qte) {
	this.quantite = qte;
}
public Float calculerTotal(double qte,Produit p)
{ return (float)(p.getPrix()*p.getQtes());}


}