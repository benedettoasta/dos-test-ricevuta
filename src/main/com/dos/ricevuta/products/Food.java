package main.com.dos.ricevuta.products;

public class Food extends AbstractProductLowTax{
	
	protected static final String TYPE_CLASS = "FOOD";

	public Food()
	{
		this.init("", 0, false,TYPE_CLASS);
	}
	
	public Food(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, false, TYPE_CLASS);
	}

	public Food(String descrizione, float price, boolean imported) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, imported,TYPE_CLASS);
	}
}
