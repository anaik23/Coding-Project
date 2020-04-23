
public class Location 
{
	//Instance Variable
	public static int unguessed = 0;
	public static int hit = 1;
	public static int missed = 2;
	public String ShipType = "";
	private int locationType;
	private boolean hasShip = false;
	
	//Constructor
	public Location() 
	{
		locationType =0;
		
	}
	
	//Methods
	public void markHit()
	{
		locationType =1;
	}
	public void markMiss()
	{
		locationType =2;
	}
	public void setShipType(String shipType) 
	{
		ShipType = shipType;
	}
	public String getShipType() 
	{
		return this.ShipType;
	}
	public boolean checkHit() 
	{
		if(locationType == 1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean checkMiss() 
	{
		if(locationType == 2) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean isUnguessed() 
	{
		if(locationType == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public void setShip(boolean val) 
	{
		hasShip = val;
	}
	public boolean hasShip() 
	{
		return hasShip;
	}
	public void setStatus(int status)
	{
		locationType = status;
	}
	public int getStatus()
	{
		return locationType;
	}
}
