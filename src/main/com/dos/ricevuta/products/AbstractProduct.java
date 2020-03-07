package main.com.dos.ricevuta.products;

import java.util.Locale;

import main.com.dos.ricevuta.contracts.IProduct;

/**
 * 
 * @author Benedetto
 *
 * Ogni prodotto presenta caratteristiche comuni.
 * Riportiamo in questa classe le informazioni condivise
 * Fra qualsiasi tipo di prodotto. Andremo eventualmente a 
 * Inserire astazioni intermedie di prodotti nel proseguimento dell'esercizio
 */
public abstract class AbstractProduct implements IProduct {
	
	protected static final float TAX_ADDED_FOREIGN_PRODUCT = 0.05F;

	protected String type;
	protected String description;
	protected float price;
	protected float taxRate;
	protected boolean imported;
	
	protected void init(String descrizione, float price, boolean imported,String type,float taxRate)
	{
		this.description = descrizione;
		this.price = price;
		this.imported = imported;
		this.type = type;
		this.taxRate = taxRate;
		if(this.imported) {
			this.taxRate = this.taxRate + TAX_ADDED_FOREIGN_PRODUCT;
		}
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public float getPriceTaxed() {
		// TODO Auto-generated method stub
		return this.price + this.getTaxes();
	}

	@Override
	public float getTaxes() {
		// TODO Auto-generated method stub
		return this.price * this.taxRate;
	}

	@Override
	public String getProductFormattedRicevutaString() {
		// TODO Auto-generated method stub
		return this.toString();
	}
	
	public String toString() {
		return this.description + " - " + this.type + ": " + String.format(Locale.US,"%.2f", this.getPriceTaxed());
	}

}
