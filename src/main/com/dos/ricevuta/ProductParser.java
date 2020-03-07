package main.com.dos.ricevuta;


public class ProductParser {
	
	protected static String DESCRIPTION_DELIMETER = "\""; 

	public static boolean isValidInput(String input) {
		// TODO Auto-generated method stub
		int firstApice = input.indexOf(DESCRIPTION_DELIMETER);
		int lastApice  = input.lastIndexOf(DESCRIPTION_DELIMETER);
		if(firstApice < 0 || lastApice < 0) {
			return false;
		}

		String inputProduct = input.substring(0,input.indexOf(DESCRIPTION_DELIMETER));
		String inputPrice 	= input.substring(input.lastIndexOf(DESCRIPTION_DELIMETER)+1);
		if(inputProduct.length()>0 && input.contains(" ") && (inputProduct+inputPrice).contains(","))
		{
			return true;
		}
		return false;
	}

}
