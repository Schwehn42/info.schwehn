package kohlhans;

public class QueryParser extends HttpURLPostProcessor
{
	public String decode (String[] args)
	{
		// {"key","value","key2","value2"} to key=value&key2=value2
		String query = "";
		String marker = "=";
		for (int i = 0; i < args.length; i++)
		{
			if (i == args.length - 1) { //no '&' at the end
				query += args[i];
				break;
			}
			query += args[i] + marker;
			
			if (marker == "=")
			{
				marker = "&";
			}
			else
			{
				marker = "=";
			}
		}

		return query;
	}
}
