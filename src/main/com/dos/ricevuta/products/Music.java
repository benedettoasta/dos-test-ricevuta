package main.com.dos.ricevuta.products;

public class Music extends AbstractProduct {
	
	protected static final float TAX_RATE = 0.1F;
	protected static final String TYPE_CLASS = "MUSIC";

	public Music()
	{
		this.init("", 0, false,TYPE_CLASS);
	}
	
	public Music(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, false, TYPE_CLASS);
	}
	
	protected void init(String descrizione, float price, boolean imported,String type)
	{
		super.init(descrizione, price, imported, type);
		
		this.taxRate = TAX_RATE;
		if(this.imported) {
			this.taxRate = this.taxRate + TAX_ADDED_FOREIGN_PRODUCT;
		}
	}
}
