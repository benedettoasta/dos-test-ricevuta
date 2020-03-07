package main.com.dos.ricevuta.products;

import java.util.Locale;

import main.com.dos.ricevuta.contracts.IProduct;

/**
 * 
 * @author Benedetto
 *
 * I prodotti generici, avranno una tassazione di 0.1
 */
public abstract class AbstractProductGenericTax extends AbstractProduct {
	
	protected static final float TAX_RATE = 0.1F;

	protected void init(String descrizione, float price, boolean imported,String type)
	{
		super.init(descrizione, price, imported, type, TAX_RATE);
	}
}
