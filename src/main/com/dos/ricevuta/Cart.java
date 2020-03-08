/**
 * 
 */
package main.com.dos.ricevuta;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import main.com.dos.ricevuta.contracts.IProduct;

/**
 * @author Benedetto
 *
 */
public class Cart {
	
	protected List<IProduct> products;
	
	public Cart() {
		this.products = new ArrayList<IProduct>();
	}
	
	public int countItems() {
		return this.products.size();
	}

	public void addProduct(IProduct product) {
		// TODO Auto-generated method stub
		this.products.add(product);
	}

	public String getBill() {
		// TODO Auto-generated method stub
		String bill = "";
		float cumulativeTaxes = 0.0F;
		float cumulativePrices = 0.0F;
		for(IProduct product:this.products) {
			bill = bill + product.getProductFormattedRicevutaString() + " ";
			cumulativePrices += product.getPriceTaxed();
			cumulativeTaxes += product.getTaxes();
		}
		bill += "TAXES: "+String.format(Locale.US,"%.2f", cumulativeTaxes)+" TOTAL: "+String.format(Locale.US,"%.2f", cumulativePrices);
		return bill;
	}
}
