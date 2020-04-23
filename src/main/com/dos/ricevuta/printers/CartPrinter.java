package main.com.dos.ricevuta.printers;

import main.com.dos.ricevuta.Cart;
import main.com.dos.ricevuta.ProductUtils;
import main.com.dos.ricevuta.contracts.IPrinter;
import main.com.dos.ricevuta.contracts.IProduct;

public class CartPrinter implements IPrinter {
	
	protected static final String PRODUCT_SEPARATOR = " ";
	protected static final String TOTAL_TAXES_LABEL = "TAXES: ";
	protected static final String TOTAL_PRICE_LABEL = "TOTAL: ";
	protected static final String LUCKY_BONUS_LABEL = "Se ti chiami ###NOME### hai vinto un buono da 50 euro";
	protected static final String LUCKY_BONUS_NAME_PLACEHOLDER= "###NOME###";
	
	protected ProductPrinter productPrinter;

	protected Cart cart;
	
	public CartPrinter(Cart cart,ProductPrinter productPrinter)
	{
		this.cart = cart;
		this.productPrinter = productPrinter;
	}

	public Object print() {
		// TODO Auto-generated method stub
		String bill = "";
		float cumulativeTaxes = 0.0F;
		float cumulativePrices = 0.0F;
		for(IProduct product:this.cart.getProducts()) {
			this.productPrinter.setProduct(product);
			bill = bill + this.productPrinter.print() + PRODUCT_SEPARATOR;
			cumulativePrices += product.getPriceTaxed();
			cumulativeTaxes += product.getTaxes();
		}
		bill += TOTAL_TAXES_LABEL + ProductUtils.priceToString(cumulativeTaxes) + PRODUCT_SEPARATOR + TOTAL_PRICE_LABEL + ProductUtils.priceToString(cumulativePrices);
		
		if(this.cart.isLuckyBonus()) {
			String randomName = ProductUtils.getRandomName();
			String luckyBonusString = LUCKY_BONUS_LABEL.replace(LUCKY_BONUS_NAME_PLACEHOLDER, randomName);
			bill += PRODUCT_SEPARATOR + luckyBonusString;
		}
		return bill;
	}
}
