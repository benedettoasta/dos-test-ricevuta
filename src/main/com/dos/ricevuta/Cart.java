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

	public Object getBill() {
		// TODO Auto-generated method stub
		return "TAXES:0.00 TOTAL: 0.00";
	}
}
