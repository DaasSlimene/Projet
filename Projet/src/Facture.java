

public class Facture {
	private int id ;
	public Facture (int id)
	{
		this.id=id;
	}
	
	
	public Facture() {
		super();
	}


	public void ajoutercmd(Ligne_Achat[] lc,Ligne_Achat l,int nc )
	{
		if (nc<lc.length)
		{lc[nc]=l;
		nc+=1;
		}
		else
		System.out.println("stock plein");}
	
	
}