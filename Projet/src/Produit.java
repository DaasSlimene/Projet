

import java.util.Scanner;

public class Produit {
private String Id;
private String des;
private double qtes;
private Float prix;
private static Produit[] produits;


public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getDes() {
	return des;
}

public void setDes(String des) {
	this.des = des;
}

public double getQtes() {
	return qtes;
}

public void setQtes(double qtes) {
	this.qtes = qtes;
}

public Float getPrix() {
	return prix;
}

public void setPrix(Float prix) {
	this.prix = prix;
}

public Produit[] getProduits() {
	return produits;
}

public void setProduits(Produit[] produits) {
	this.produits = produits;
}

public Produit(String id,String des,Double qtes,Float prix)
{
	this.Id=id;
	this.des=des;
	this.qtes=qtes;
	this.prix=prix;
}


public void ajouterProduit(Produit[] produits,Produit p,int nbProduit )
{
	if (nbProduit<produits.length)
	{produits[nbProduit]=p;
	nbProduit+=1;
	}
	else
	System.out.println(" Désole le stock est  plein");
}
public void afficherProduit(Produit[] produits,int nbProduit)
{
    for (int i=0;i<nbProduit;i++)
    {
       
        System.out.println("L'article n"+i+" sa Libelle "+produits[i].des+" son prix est"+produits[i].prix+"et sa quantité en stock est"+produits[i].qtes);
       
    }
}
}