package main.com.dos.ricevuta;


public class ProductParser {
	
	public static boolean isValidInput(String input) {
		// TODO Auto-generated method stub
		if(input.contains(" ") && input.contains(","))
		{
			return true;
		}
		return false;
	}

}
