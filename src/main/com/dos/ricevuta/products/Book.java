package main.com.dos.ricevuta.products;

public class Book extends AbstractProductLowTax{
	
	protected static final String TYPE_CLASS = "BOOK";
	
	public Book()
	{
		this.init("", 0, false,TYPE_CLASS);
	}

	public Book(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, false,TYPE_CLASS);
	}

	public Book(String descrizione, float price, boolean imported) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, imported,TYPE_CLASS);
	}
}
