/**
 * 
 */
package main.com.dos.ricevuta;

import java.util.Scanner;

/**
 * @author Benedetto
 *
 */
public class Application {
	
	protected static String[] prodottiPreimpostati = {
			"",
			"Libro \"Il signore degli anelli\", prezzo 12.49",
			"CompactDisc \"Innuendo\", prezzo 14.99",
			"Snack \"Cioccolata\", prezzo 0.85",
			"Imported Fumetto \"Topolino\", prezzo 5.99",
			"Imported Pasta \"Spaghetti, numero 5\", prezzo 1.99",
			"Antibiotico \"Tachipirina 500, pillole\", prezzo 12.99",
			"Imported Antibiotico \"nuovo farmaco estero\", prezzo 12.99",
			"ProdottoGenerico \"Pentole da cucina\", prezzo 90.85",		
			"",
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("###### DEMO - DOS - APPLICAZIONE RICEVUTA");
		System.err.println("##########################################");
		System.err.println("Puoi inserire un nuovo prodotto rispettando il seguente formato: ");
		System.err.println("- Inserire \"Imported \" in caso di merce importata");
		System.err.println("- Inserire la tipologia del prodotto (ad esempio fumetto, pasta, libro, snack,...)");
		System.err.println("- Inserire la descrizione tra apici (ad esempio \"Topolino\")");
		System.err.println("- Inserire il prezzo preceduto da \", prezzo \" (ad esempio \", prezzo 5.99\")");
		System.err.println("Esempio: Imported Fumetto \"Topolino\", prezzo 5.99");
		System.err.println("##########################################");
		System.err.println("Oppure puoi selezionare un prodotto preimpostato scrivendo PRODOTTO#{numero} e selezionando il numero dall'elenco sottostante: ");
		System.err.println("1. Libro \"Il signore degli anelli\", prezzo 12.49");
		System.err.println("2. CompactDisc \"Innuendo\", prezzo 14.99");
		System.err.println("3. Snack \"Cioccolata\", prezzo 0.85");
		System.err.println("4. Imported Fumetto \"Topolino\", prezzo 5.99");
		System.err.println("5. Imported Pasta \"Spaghetti, numero 5\", prezzo 1.99");
		System.err.println("6. Antibiotico \"Tachipirina 500, pillole\", prezzo 12.99");
		System.err.println("7. Imported Antibiotico \"nuovo farmaco estero\", prezzo 12.99");
		System.err.println("8. ProdottoGenerico \"Pentole da cucina\", prezzo 90.85");
		System.err.println("Esempio: digitare \"PRODOTTO#1\" per inserire il libro \"il signore degli anelli\"");
		System.err.println("##########################################");
		System.err.println("Digitare \"BILL\" per generare una ricevuta");
		System.err.println("NOTA: il numero di ricevute viene conteggiato anche se vuote; digitare \"BILL\" 10 volte per verificare che la decima ricevuta contenga il messaggio del concorso");
		System.err.println("##########################################");
		
		Scanner scanner = new Scanner(System.in);
		ShopRegister shopRegister = new ShopRegister();
		boolean addNewCart = true;
		/**
		 * creo un loop finchè non uso una chiave di "stop"
		 */
		Cart cart;
		while(true) {
			if(addNewCart) {
				shopRegister.addCart(new Cart());
				addNewCart = false;
			}
			cart = shopRegister.getLastCart();
			
			System.out.println("Inserisci Prodotto: ");
			String input = scanner.nextLine();
			if("BILL".equals(input.toUpperCase())) {
				
				System.out.println(cart.getBill());
				addNewCart = true;
				
			}
			else{
				String prodotto = getInputStringFromPreconfigured(input);
				if(ProductParser.isValidInput(prodotto)){
					cart.addProduct(ProductFactory.create(prodotto));
				}
				else {
					System.out.println("Prodotto non valido, non inserito in carrello");
				}
			}
						
			System.out.println("");
		}
	}
	
	private static String getInputStringFromPreconfigured(String input)
	{
		String toReturn = input;
		if(input.toUpperCase().startsWith("PRODOTTO#"))
		{
			try {
				int index = Integer.parseInt(input.substring("PRODOTTO#".length()));
				toReturn = prodottiPreimpostati[index];
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return toReturn;
				
	}

}
