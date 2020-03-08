/**
 * 
 */
package main.com.dos.ricevuta;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

import org.json.JSONObject;

/**
 * @author Benedetto
 *
 */
public class ProductUtils {
	
	public static String priceToString(float value) {
		return String.format(Locale.US,"%.2f", value);
	}

	public static String getRandomName() {
		// TODO Auto-generated method stub
		String json = null;
		try {
		      URL url = new URL("https://randomuser.me/api");
		      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		      connection.setDoOutput(true);
		      connection.setInstanceFollowRedirects(false);
		      connection.setRequestMethod("GET");
		      connection.setRequestProperty("Content-Type", "application/json");
		      connection.setRequestProperty("charset", "utf-8");
		      connection.connect();
		      InputStream inStream = connection.getInputStream();
		      json = streamToString(inStream); // input stream to string
	    } catch (IOException ex) {
	    	  return "#NO_CONNECTION#";
	    }
		JSONObject obj = new JSONObject(json);
		JSONObject data = obj.getJSONArray("results").getJSONObject(0).getJSONObject("name");
		String name = (String) data.get("first");
		return name;
	}
	
	private static String streamToString(InputStream inputStream) {
	    try (Scanner scanner = new Scanner(inputStream, "UTF-8")) {
			String text = scanner.useDelimiter("\\Z").next();
			return text;
		}
	}
}
