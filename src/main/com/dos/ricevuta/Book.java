package main.com.dos.ricevuta;

public class Book {
	
	public static final String TYPE_CLASS = "BOOK";
	
	protected String type;
	protected String description;
	protected float price;
	
	public Book()
	{
		this.type  = Book.TYPE_CLASS;
		this.description = "";
		this.price = 0;
	}

	public Book(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.type  = Book.TYPE_CLASS;
		this.description = descrizione;
		this.price = price;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	public Object getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
