package main.com.dos.ricevuta;

public class Book {
	
	public static final String TYPE_CLASS = "BOOK";
	public static final float TAX_RATE = 0F;
	
	protected String type;
	protected String description;
	protected float price;
	protected float taxRate;
	
	public Book()
	{
		this.type  = Book.TYPE_CLASS;
		this.taxRate = Book.TAX_RATE;
		
		this.description = "";
		this.price = 0;
	}

	public Book(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.type  = Book.TYPE_CLASS;
		this.taxRate = Book.TAX_RATE;
		
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

	public float getPriceTaxed() {
		// TODO Auto-generated method stub
		return this.price + this.getTaxes();
	}
	
	public float getTaxes() {
		return  this.price * this.taxRate;
	}

}
