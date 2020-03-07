package main.com.dos.ricevuta.products;

public class Book extends AbstractProduct{
	
	protected static final String TYPE_CLASS = "BOOK";
	
	public Book()
	{
		this.init("", 0, false);
	}

	public Book(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, false);
	}

	public Book(String descrizione, float price, boolean imported) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, imported);
	}
	
	protected void init(String descrizione, float price, boolean imported)
	{
		super.init(descrizione, price, imported);
		this.type  = Book.TYPE_CLASS;
	}
}
