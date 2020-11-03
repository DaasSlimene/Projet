


public class Administrateur extends Personne {
	private  String adresse;
	 private  String tel;
	private  String mail;
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Administrateur(int id, String nom, String prenom, String adresse, String tel, String mail) {
		super(id, nom, prenom);
		this.adresse = adresse;
		this.tel = tel;
		this.mail = mail;
	}
	
	
	
}
