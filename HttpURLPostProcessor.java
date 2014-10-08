// HI I'M POST

package kohlhans;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLPostProcessor extends Connection
{
	// HTTP POST request
	public void sendPost (String url, String[] query) throws Exception
	{
		QueryParser parser = new QueryParser();
		String urlParameters = parser.decode(query);
		URL URLobj = new URL(url);
		URLConnection conn = URLobj.openConnection();

		conn.setDoOutput(true);

		OutputStreamWriter writer = new OutputStreamWriter(
		        conn.getOutputStream());

		System.out.println("Sending 'POST' request to: " + url);
		System.out.println("Parameters: " + urlParameters);

		writer.write(urlParameters);
		writer.flush();

		String line;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
		        conn.getInputStream()));

		while ((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}
		writer.close();
		reader.close();
	}
}
