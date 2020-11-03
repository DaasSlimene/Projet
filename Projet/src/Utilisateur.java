

public class Utilisateur extends Personne {
	
 private  String adresse;
 private  String tel;
private  String mail;
public Utilisateur(int id, String nom, String prenom) {
	super(id, nom, prenom);

}

void ajouterUser(Utilisateur[] u,Utilisateur utilisateur,int nbu) {
	
	if (nbu<u.length) {
		u[nbu]=utilisateur;
		nbu++;
		
	}

}




}
