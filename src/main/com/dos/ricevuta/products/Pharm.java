/**
 * 
 */
package main.com.dos.ricevuta.products;

/**
 * @author Benedetto
 *
 */
public class Pharm extends AbstractProduct {
	
	protected static final String TYPE_CLASS = "PHARM";
	
	public Pharm()
	{
		this.init("", 0, false,TYPE_CLASS);
	}

	public Pharm(String descrizione, float price) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, false,TYPE_CLASS);
	}

	public Pharm(String descrizione, float price, boolean imported) {
		// TODO Auto-generated constructor stub
		this.init(descrizione, price, imported,TYPE_CLASS);
	}
}
