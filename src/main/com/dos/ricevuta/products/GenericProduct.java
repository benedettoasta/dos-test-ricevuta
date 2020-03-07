package main.com.dos.ricevuta.products;

public class GenericProduct extends AbstractProduct {

	protected static final String TYPE_CLASS = "GENERIC";

	public GenericProduct()
	{
		this.init("", 0, false,TYPE_CLASS);
	}
}
