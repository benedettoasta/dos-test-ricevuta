package main.com.dos.ricevuta.products;

public class Music extends AbstractProductGenericTax {
	
	protected static final String TYPE_CLASS = "MUSIC";

	public Music()
	{
		this.init("", 0, false,TYPE_CLASS);
	}
	
	public Music(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, false, TYPE_CLASS);
	}
	
	public Music(String descrizione, float price, boolean imported) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, imported,TYPE_CLASS);
	}
	
}
