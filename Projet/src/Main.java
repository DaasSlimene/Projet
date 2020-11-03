

import java.util.Scanner;

public class Main {

	
	public static void main (String[] args)
{Produit[] produits= new Produit[30];
Ligne_Achat[] Lc= new Ligne_Achat[30];
Utilisateur[] users= new Utilisateur[30];
int s=0;
int n=1;
int a=0;
do {
	System.out.println("Bienvenue cher Administrateur : ");

System.out.println("Vous pouvez :");
System.out.println("1: Ajouter un produit ");
System.out.println("2: ajouter utilisateur ");
System.out.println("3: Connecter tant que Utilisateur ");



Scanner sc = new Scanner( System.in );
 a = sc.nextInt();

switch(a) {
 case 1:{
	 
	do {
		Scanner scanner = new Scanner( System.in );
		System.out.println("id=");
		String id = scanner.nextLine();
		System.out.println("Libelle=");
		String des = scanner.nextLine();
		System.out.println("Quantité=");
		double qtes= scanner.nextDouble();
		System.out.println("prix=");
		Float prix = scanner.nextFloat();
		
		Produit p=new Produit(id,des,qtes,prix);
		p.ajouterProduit(produits, p, n-1);
		p.afficherProduit(produits,n);
		System.out.println("vous voulez ajouter un produit:");
		System.out.println("1-Oui");
		System.out.println("2-Non");


		Scanner scr = new Scanner( System.in );
		s = scr.nextInt();
		n+=1;
	}while(s==1);
 break;}
 case 2:{
	 do {
			Scanner scanner = new Scanner( System.in );
			System.out.println("id=");
			int id = scanner.nextInt();
			System.out.println("nom=");
			String nom = scanner.nextLine();
			System.out.println("prenom=");
			String prenom= scanner.nextLine();
		
			
			Utilisateur user=new Utilisateur(id,nom,prenom);
			user.ajouterUser(users, user, n-1);
			System.out.println("vous voulez ajouter un utilisateur ");
			System.out.println("1-Oui");
			System.out.println("2-Non");

			Scanner scr = new Scanner( System.in );
			s = scr.nextInt();
			n+=1;
		}while(s==1);
 }
     
 break;
default:
 // code block
		}}while(a!=3);
System.out.println("Bienvenue cher Utilisateur :");

int j=0;
System.out.println("donner l'id facture");
Scanner sr = new Scanner( System.in );
int q= sr.nextInt();

Facture f = new Facture(q);
do {
	Scanner scanner = new Scanner( System.in );
	System.out.println("position=");
	int po = scanner.nextInt();
	System.out.println("Quantité=");
	double qte= scanner.nextDouble();
	Ligne_Achat y=new Ligne_Achat(produits[po],qte);
	
	f.ajoutercmd(Lc,y,j);
	System.out.println("vous voulez ajouter une ligne d'Achat  1:oui // 2:non");
	Scanner scr = new Scanner( System.in );
	s = scr.nextInt();
	j+=1;
}while(s==1);
Float total=0.0f;
for(int h=0;h<j;h++)
{System.out.println("produit :"+Lc[h].getP().getDes()+"  prix unitaire :"+Lc[h].getP().getPrix()+"  quantité  : "+Lc[h].getQuantite()+"  total  "+Lc[h].calculerTotal(Lc[h].getQuantite(), Lc[h].getP()));
total+=Lc[h].calculerTotal(Lc[h].getQuantite(), Lc[h].getP());
	}
System.out.println("le total a payer est : "+total);
}
}