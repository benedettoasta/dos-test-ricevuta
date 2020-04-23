package main.com.dos.ricevuta.contracts;


/**
 * 
 * @author Benedetto
 *
 * Refactoring dei prodotti
 * Tutti i prodotti devono rispettare questo contratto ed 
 * implementare i metodi che ne definiscano le caratteristiche
 */
public interface IProduct {
	
	public String getType();
	public String getDescription();
	public float getPrice();
	public float getPriceTaxed();
	public float getTaxes();
}
