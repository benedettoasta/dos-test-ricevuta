package main.com.dos.ricevuta;


public class ProductParser {
	
	protected static String DESCRIPTION_DELIMETER = "\""; 
	protected static String PRICE_PREFIX = ", prezzo ";
	protected static String IMPORTED_PREFIX = "imported "; 


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
	
	public static String getTypeFromValidInput(String input) {
		if(isValidInput(input))
		{
			int start = 0;
			if(input.toLowerCase().startsWith(IMPORTED_PREFIX)){
				start = IMPORTED_PREFIX.length();
			}
			
			return input.substring(start,input.indexOf(DESCRIPTION_DELIMETER)).trim().toLowerCase();
		}
		return null;
	}
	
	public static String getDescriptionFromValidInput(String input) {
		if(isValidInput(input))
		{
			return input.substring(
					input.indexOf(DESCRIPTION_DELIMETER)+1,
					input.lastIndexOf(DESCRIPTION_DELIMETER)
			).trim();
		}
		return null;
	}
	
	public static float getPriceFromValidInput(String input) {
		if(isValidInput(input))
		{
			float value = 0.0F;
			try
			{
				value =	Float.parseFloat(
						input.substring(
								input.lastIndexOf(DESCRIPTION_DELIMETER)+1)
										.substring(PRICE_PREFIX.length()
						)
				);
			}catch (Exception e) {}
			
			return value;
		}
		return 0.0F;
	}

	public static boolean getImportedFromValidInput(String input) {
		if(input.toLowerCase().startsWith(IMPORTED_PREFIX)){
			return true;
		}
		return false;
	}
}
