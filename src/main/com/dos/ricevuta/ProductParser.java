package main.com.dos.ricevuta;


public class ProductParser {
	
	protected static String DESCRIPTION_DELIMETER = "\""; 
	protected static String PRICE_PREFIX = ", prezzo "; 

	public static boolean isValidInput(String input) {
		// TODO Auto-generated method stub
		int firstApice = input.indexOf(DESCRIPTION_DELIMETER);
		int lastApice  = input.lastIndexOf(DESCRIPTION_DELIMETER);
		if(firstApice < 0 || lastApice < 0) {
			return false;
		}
		
		String inputProduct = input.substring(0,firstApice);
		String inputPrice 	= input.substring(lastApice+1);
		
		if(inputProduct.length()>0 && inputPrice.startsWith(PRICE_PREFIX)) {
			try
			{
				Float.parseFloat(inputPrice.substring(PRICE_PREFIX.length()+1));
			}catch (Exception e) {
				return false;
			}
			return true;
		}
		return false;
	}

}
