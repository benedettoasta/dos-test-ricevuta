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
	protected static final String LUCKY_BONUS_LABEL = "Se ti chiami ###NOME### hai vinto un buono da 50 euro";
	protected static final String LUCKY_BONUS_NAME_PLACEHOLDER= "###NOME###";
	
	protected List<IProduct> products;
	protected boolean luckyBonus;
	
	public Cart() {
		this.products = new ArrayList<IProduct>();
		this.luckyBonus = false;
	}
	
	public List<IProduct> getProducts() {
		return products;
	}

	public void setProducts(List<IProduct> products) {
		this.products = products;
	}

	public int countItems() {
		return this.products.size();
	}

	public void addProduct(IProduct product) {
		// TODO Auto-generated method stub
		this.products.add(product);
	}

	public void setLuckyBonus(boolean luckyBonus) {
		// TODO Auto-generated method stub
		this.luckyBonus = luckyBonus;
	}

	public boolean isLuckyBonus() {
		// TODO Auto-generated method stub
		return this.luckyBonus;
	}
}
