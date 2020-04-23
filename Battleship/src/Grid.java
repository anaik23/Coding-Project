
public class Grid 
{
	//Instance Variables
	private Location[][] grid = new Location[10][10];
	public int numOfTwoShip =0;
	public int numOfThreeShip =0;
	public int numOfFourShip = 0;
	public int numOfFiveShip =0;
	public static int rows = 10;
	public static int cols = 10;
	public int totalShips = 0;
	public boolean shipGotAdded = true;
	public int set =0;
	public int totalOShips =0;
	public boolean showOutput = true;
	
	//Constructor
	public Grid() 
	{
		for (int row =0; row<rows; row++) 
		{
			for(int col =0; col<cols; col++) 
			{
				Location board = new Location();
				grid[row][col] = board;
				
			}
		}
	}
	
	//Methods 
	
	//Marks location with a hit
	public void markHit(int row, int col) 
	{
		if (row > 9 || col > 9) 
		{
			System.out.println("Your input must be within the grid");
		}
		else 
		{
			Location point = grid[row][col];
			point.markHit();
			
		}
	}
		
	//Marks location with a miss
	public void markMiss(int row, int col) 
	{
		if (row > 9 || col > 9) 
		{
			System.out.println("Your input must be within the grid");
		}
		else 
		{
			Location point = grid[row][col];
			point.markMiss();
			
		}
	}
	
	//Sets the status of the specific location
	public void setStatus(int row, int col, int status) 
	{
		if (row > 9 || col > 9) 
		{
			System.out.println("Your input must be within the grid");
		}
		else 
		{
			Location point = grid[row][col];
			point.setStatus(status);
		}
	}
	
	//Returns status of the specific location
	public int getStatus(int row, int col) 
	{
		if (row > 9 || col > 9) 
		{
			System.out.println("Your input must be within the grid");
			return 0;
		}
		else 
		{
			Location point = grid[row][col];
			return point.getStatus();
		}
	}
	
	//Sets a ship in the selected location
	public void setShip(int row, int col, boolean val) 
	{
		if (row > 9 || col > 9) 
		{
			System.out.println("Your input must be within the grid");
		}
		else 
		{
			Location point = grid[row][col];
			point.setShip(val);
		}
	}
	
	//Checks if location is already guessed
	public boolean alreadyGuessed(int row, int col) 
	{
		Location point = grid[row][col];
		return point.isUnguessed() == false;
	}
	
	//Checks if location has a ship
	public boolean hasShip(int row, int col) 
	{
		if (row > 9 || col > 9) 
		{
			System.out.println("Your input must be within the grid");
			return false;
		}
		else 
		{
			Location point = grid[row][col];
			return point.hasShip();
		}
	}
	
	//Returns the location of the point
	public Location getLocation(int row, int col) 
	{
		return grid[row][col];
	}
	
	//Returns the number of rows
	public int numRows() 
	{
		return rows;
	}
	
	//Returns the number of columns
	public int numCols() 
	{
		return cols;
	}
	
	//Prints the grid
	public void printStatus()
	{
		//Prints out the numbers on the top of the grid
		System.out.print(" ");
        for(int i = 1; i < 11; i++)
        {
        	System.out.print(" " + i );
        }
        System.out.print("\n");
        
        for (int i = 0; i < numRows(); i++)
        {
			//prints out the letters at the sides of the grid
            char startingchar = (char)(i + 65);
            System.out.print(startingchar + "");
            for (int l = 0; l < numCols(); l++)
            {
                
                Location theSquare = grid[i][l];
                int status = theSquare.getStatus();
                
				
				//prints out the status for each
                if (status == 0)
                {
                	System.out.print(" -");
                }
                else if (status == 1)
                {
                	System.out.print(" X");
                }
                else
                {
                    System.out.print(" O");
                }
                
            }
            System.out.print(" \n");
        }
        
    }
	
	//Prints the ships on the grid
	public void printShip()
	{
        
		System.out.print(" ");
        for(int i = 1; i < 11; i++)
        {
        	System.out.print(" " + i);
        }
        
        System.out.print("\n");
        
        for (int i = 0; i < 10; i++)
        {
            char startingchar = (char)(i + 65);
            System.out.print(""+startingchar);
            for (int l = 0; l < 10; l++)
            {
                
                Location theSquare = grid[i][l];
                boolean status = theSquare.hasShip();
                
                if (status){
                	System.out.print(" X");
                }
                else
                {
                	System.out.print(" -");
                }
                
            }
            System.out.print(" \n");
        }
        
    }
	
	//Adds a certain ship
	public void addShip(Ship s) 
	{
		int shipLength = s.getLength();
		int shipDirection = s.getDirection();
		if(s.shipSet == false) 
		{
			boolean setShip = true;
		
		if(shipDirection == 0) 
		{
			if (s.getCol() + shipLength > (cols)) 
			{
				//System.out.println("The ship sticks off the grid!");
			}
			else 
			{
				for(int i=0; i<shipLength; i++) 
				{
					if(i + s.getCol() < 10) 
					{
						Location shipLocation = grid[s.getRow()][s.getCol() + i];
						if(shipLocation.hasShip()) 
						{
							System.out.println("A Ship already has been placed on one of these spaces!");
							setShip = false;
						}
					}
				}
			}
		}
		else if(shipDirection == 1) 
		{
			if(s.getRow() + shipLength > (rows)) 
			{
				//System.out.println("The ship sticks off the grid!")
			}
			else 
			{
				for(int i =0; i< shipLength; i++) 
				{
					if(i + s.getRow() < 10) 
					{
						Location shipLocation = grid[s.getRow()+ i][s.getCol()];
						if(shipLocation.hasShip()) 
						{
							System.out.println("A ship already exsists on one of these spaces!");
							setShip = false;
						}
					}
				}
			}
		}
		if(shipDirection == 0 && s.getCol() + s.getLength() < 11 && setShip) 
		{
			for(int i =0; i< shipLength; i++) 
			{
				Location shipLocation = grid[s.getRow()][s.getCol() + i];
				shipLocation.setShip(true);
				s.shipSet = true;
				if(shipLength == 2) 
				{
					shipLocation.setShipType("PatrolBoat");
				}
				else if(shipLength == 3 && set < 3) 
				{
					shipLocation.setShipType("Submarine");
				}
				else if(shipLength == 3) 
				{
					shipLocation.setShipType("Destroyer");
				}
				else if (shipLength == 4) 
				{
					shipLocation.setShipType("Battleship");
				}
				else if(shipLength == 5) 
				{
					shipLocation.setShipType("Carrier");
				}
			}
			System.out.println("Ship has been successfully added!");
			totalShips++;
			if(shipLength == 2) 
			{
				numOfTwoShip++;
			}
			else if(shipLength == 3)
			{
				numOfThreeShip++;
			}
			else if(shipLength == 4)
			{
				numOfFourShip++;
			}
			else if(shipLength == 5) 
			{
				numOfFiveShip++;
			}
		}
		else if(shipDirection == 1 && s.getRow() + s.getLength() < 11 && setShip) 
		{
			for(int i =0; i< shipLength; i++) 
			{
				Location shipLocation = grid[s.getRow() + i][s.getCol()];
				shipLocation.setShip(true);
				s.shipSet = true;
				if(shipLength == 2) 
				{
					shipLocation.setShipType("PatrolBoat");
				}
				else if(shipLength == 3 && set < 3) 
				{
					shipLocation.setShipType("Submarine");
				}
				else if(shipLength == 3) 
				{
					shipLocation.setShipType("Destroyer");
				}
				else if (shipLength == 4) 
				{
					shipLocation.setShipType("Battleship");
				}
				else if(shipLength == 5) 
				{
					shipLocation.setShipType("Carrier");
				}
			}
			System.out.println("Ship has been successfully added!");
			totalShips++;
			if(shipLength == 2) 
			{
				numOfTwoShip++;
			}
			else if(shipLength == 3)
			{
				numOfThreeShip++;
			}
			else if(shipLength == 4)
			{
				numOfFourShip++;
			}
			else if(shipLength == 5) 
			{
				numOfFiveShip++;
			}
			
		}
		else if (setShip != false)
		{
			System.out.println("Your ship sticks off the grid");
		}
		else 
		{
			
		}
		
	}
	else 
	{
			System.out.println("The ship's location is already set!");
	}
		
 }

	
	
}
