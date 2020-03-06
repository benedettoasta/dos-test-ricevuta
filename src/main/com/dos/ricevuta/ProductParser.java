package main.com.dos.ricevuta;


public class ProductParser {
	
	public static boolean isValidInput(String input) {
		// TODO Auto-generated method stub
		String inputProduct = input.substring(0,input.indexOf("\""));
		String inputPrice 	= input.substring(input.lastIndexOf("\"")+1);
		if(input.contains(" ") && (inputProduct+inputPrice).contains(","))
		{
			return true;
		}
		return false;
	}

}
