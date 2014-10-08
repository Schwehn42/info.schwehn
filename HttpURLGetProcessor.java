// HI I'M GET

package kohlhans;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLGetProcessor extends Connection
{

	private final String USER_AGENT = "Mozilla/5.0";

	// HTTP GET request
	public void sendGet (String url) throws Exception
	{
		URL URLobj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) URLobj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to: " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
		        con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null)
		{
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}
}
