
public class Assignment 
{
	public int totalPoints;
	public String earnedPoints;
	public String name;
	public Assignment() 
	{
		
	}
	public void set_earnedPoints(String earnedPoints)
	{
		this.earnedPoints = earnedPoints;
	}
	public int getPoints() 
	{
		int x =0;
		if (earnedPoints.equals("E")) 
		{
			x+=0;
		}
		else 
		{
			x += Integer.valueOf(earnedPoints);
		}
	return x;
	}
	
	
}
