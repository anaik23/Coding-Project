import java.util.ArrayList;

public class Ship 
{
	private ArrayList<String> location;
	private String name;
	
	public String checkYourself(String stringGuess) 
	{
		String result = "miss";
		int index = location.indexOf(stringGuess);
			if (index >= 0) 
			{
				location.remove(index);
				if(location.isEmpty())
				{
					result = "sink";	
				}
				else
				{
					result = "hit";
				}
			}
		
		return result;
	}
	
	public void setLocation(ArrayList<String> locations) 
	{
		this.location = locations;
	}

	public void setName(String name) 
	{
		this.name = name;
		
	}
}
