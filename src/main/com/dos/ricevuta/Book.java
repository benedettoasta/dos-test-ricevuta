package main.com.dos.ricevuta;

public class Book {
	
	protected static final String TYPE_CLASS = "BOOK";
	protected static final float TAX_RATE = 0F;
	protected static final float TAX_ADDED_FOREIGN_PRODUCT = 0.05F;
	
	protected String type;
	protected String description;
	protected float price;
	protected float taxRate;
	protected boolean imported;
	
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
		this.type  = Book.TYPE_CLASS;
		this.taxRate = Book.TAX_RATE;
		
		this.description = descrizione;
		this.price = price;
		this.imported = imported;
		if(this.imported) {
			this.taxRate = this.taxRate + Book.TAX_ADDED_FOREIGN_PRODUCT;
		}
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
