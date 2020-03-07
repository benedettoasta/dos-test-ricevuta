package main.com.dos.ricevuta.products;


/**
 * 
 * @author Benedetto
 *
 * I prodotti low tax avranno un calcolo differente
 * sulla tassazione.
 */
public abstract class AbstractProductLowTax extends AbstractProduct {
	
	protected static final float TAX_RATE = 0.0F;

	protected void init(String descrizione, float price, boolean imported,String type)
	{
		super.init(descrizione, price, imported, type, TAX_RATE);
	}
}
