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
		
		if(luckyBonus) {
			String randomName = ProductUtils.getRandomName();
			String luckyBonusString = LUCKY_BONUS_LABEL.replace(LUCKY_BONUS_NAME_PLACEHOLDER, randomName);
			bill += PRODUCT_SEPARATOR + luckyBonusString;
		}
		return bill;
	}

	public void setLuckyBonus(boolean luckyBonus) {
		// TODO Auto-generated method stub
		this.luckyBonus = luckyBonus;
	}
}
