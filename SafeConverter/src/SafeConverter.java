
public class SafeConverter 
{
	public static double convertFromTo(String from, String to, double temperature)
	{
		switch(from)
		{
		case "K":
			switch(to)
			{
			case "K":
				return temperature;
			case "F":
				return (temperature - 273.15) * 1.8 + 32;
			case "C":
				return temperature - 273.15;
			}
			break;
		case "C":
			switch(to)
			{
			case "K":
				return temperature + 273.15;
			case "F":
				return temperature * 1.8 + 32;
			case "C":
				return temperature;
			}
			break;
		case "F":
			switch(to)
			{
			case "K":
				return (temperature - 273.15 - 32) / 1.8;
			case "F":
				return temperature ;
			case "C":
				return (temperature - 32) / 1.8;
			}
			break;
		}
		return 0;
	}
}
