// HI I'M MAIN

package kohlhans;

public class Connection
{

	public static void main (String[] args) throws Exception
	{
		Connection http = new Connection();
		HttpURLGetProcessor get = http.newHttpURLGetProcessor();
		HttpURLPostProcessor post = http.newHttpURLPostProcessor();

		System.out.println("Testing 1 - Send Http GET request");
		get.sendGet("http://schwehn.info/p/kohlhans/get.php");

		System.out.println("\nTesting 2 - Send Http POST request");
		String[] query = {"text", "hi", "test", "value"};
		post.sendPost("http://schwehn.info/p/kohlhans/post.php", query);

	}

	private HttpURLGetProcessor newHttpURLGetProcessor ( )
	{
		return new HttpURLGetProcessor();
	}

	private HttpURLPostProcessor newHttpURLPostProcessor ( )
	{
		return new HttpURLPostProcessor();
	}
}
