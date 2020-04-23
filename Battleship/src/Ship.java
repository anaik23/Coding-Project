
public class Ship 
{
	//Instance Variables
	private int shipRow = -1;
	private int shipCol = -1;
	private int shipLength = 0;
	private int shipDirection = -1;
	private boolean locationSet = false;
	private boolean directionSet = false;
	public boolean shipSet = false;
	public static int unset = -1;
	public static int hori =0;
	public static int verti = 1;
	
	//Constructor
	public Ship(int length) 
	{
		if(length > 5) 
		{
			System.out.println("The Ship's maximun length is 5!");
		}
		else 
		{
			shipLength = length;
		}
	}
	
	//Methods
	public boolean isLocationSet() 
	{
		return locationSet;
	}
	
	public boolean isDirectionSet() 
	{
		return directionSet;
	}
	
	public void setLocation(int row, int col) 
	{
		shipRow = row;
		shipCol = col;
		locationSet = true;
	}
	
	public void setDirection(int direction)
	{
		if(direction == -1 || direction == 0 || direction == 1) 
		{
			if(direction == 0 && (shipCol + shipLength) > 11) 
			{
				System.out.println("The ship cannot fit on the board horizontally");
			}
			else if(direction == 1 && (shipRow + shipLength) > 11) 
			{
				System.out.println("The ship cannot fit on the board vertically");
			}
			else
			{
				shipDirection = direction;
				directionSet = true;
			}
		}
	}
	
	public int getRow() 
	{
		return shipRow;
	}
	public int getCol()
	{
		return shipCol;
	}
	public int getLength() 
	{
		return shipLength;
	}
	public int getDirection() 
	{
		return shipDirection;
	}
	
	private String directionToString() 
	{
		if (shipDirection == -1) 
		{
			return "unset";
		}
		if(shipDirection == 0) 
		{
			return "horizontal";
		}
		if(shipDirection == 1) 
		{
			return "vertical";
		}
		else 
		{
			return "";
		}
	}
	
	public String toString()
	{
		if(shipDirection == -1) 
		{
			return "unset direction ship of length " + shipLength + " at (unset location)";
		}
		else 
		{
			return this.directionToString() + "ship of length " + shipLength + " at (" + shipRow + ", " + shipCol + ")";
		}
	}
}
