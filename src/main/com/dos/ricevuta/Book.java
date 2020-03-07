package main.com.dos.ricevuta;

public class Book {
	
	protected String type;
	protected String description;
	protected float price;
	
	public Book()
	{
		this.type  = "BOOK";
		this.description = "";
		this.price = 0;
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
