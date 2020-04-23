package main.com.dos.ricevuta.printers;

import main.com.dos.ricevuta.ProductUtils;
import main.com.dos.ricevuta.contracts.IPrinter;
import main.com.dos.ricevuta.contracts.IProduct;

public class ProductPrinter implements IPrinter {

	protected IProduct product;
	
	public ProductPrinter()
	{
		
	}
	public ProductPrinter(IProduct product)
	{
		this.product = product;	
	}

	public Object print() {
		return product.getDescription() + " - " + product.getType() + ": " + ProductUtils.priceToString(product.getPriceTaxed());
	}

	public void setProduct(IProduct product) {
		this.product = product;
	}
}
