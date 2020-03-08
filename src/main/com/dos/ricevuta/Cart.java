/**
 * 
 */
package main.com.dos.ricevuta;

import java.util.ArrayList;
import java.util.List;

import main.com.dos.ricevuta.contracts.IProduct;

/**
 * @author Benedetto
 *
 */
public class Cart {
	
	protected static final String PRODUCT_SEPARATOR = " ";
	protected static final String TOTAL_TAXES_LABEL = "TAXES: ";
	protected static final String TOTAL_PRICE_LABEL = "TOTAL: ";
	
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
			bill = bill + product.getProductFormattedRicevutaString() + PRODUCT_SEPARATOR;
			cumulativePrices += product.getPriceTaxed();
			cumulativeTaxes += product.getTaxes();
		}
		bill += TOTAL_TAXES_LABEL + ProductUtils.priceToString(cumulativeTaxes) + PRODUCT_SEPARATOR + TOTAL_PRICE_LABEL + ProductUtils.priceToString(cumulativePrices);
		return bill;
	}
}
