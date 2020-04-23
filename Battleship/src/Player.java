import java.util.*;
public class Player 
{
	//Instance Variable
	public boolean showOutput = true;
	private static int [] ship_lengths = {2,3,4,5};
	public int hitShips =0;
	public int patrolHits = 0;
	public int submarineHits = 0;
	public int destroyerHits = 0;
	public int battleshipHits = 0;
	public int carrierHits = 0;
	
	public Grid playerGrid = new Grid();
	public Grid computerGrid = new Grid();
	
	//Methods
	public void chooseShipLocation(Ship s, int row, int col, int direction) 
	{
		int shipLength = s.getLength();
		if(shipLength != 2 && shipLength !=3 && shipLength !=4 && shipLength !=5) 
		{
			System.out.println("Ship must have one of the following lengths 2,3,4,5");
		}
		else 
		{
			if(shipLength == 2) 
			{
				int numOfTwoShip = playerGrid.numOfTwoShip;
				if(numOfTwoShip >= 1 ) 
				{
					System.out.println("You can only have one ship with length of 2");
				}
				else 
				{
					s.setDirection(direction);
					s.setLocation(row, col);
					playerGrid.addShip(s);
				}
			}
			if(shipLength == 3) 
			{
				int numOfThreeShip = playerGrid.numOfThreeShip;
				if(numOfThreeShip >= 2) 
				{
					System.out.println("You can only have two ship with length of 3");
				}
				else 
				{
					s.setDirection(direction);
					s.setLocation(row, col);
					playerGrid.addShip(s);
				}
			}
			if(shipLength == 4) 
			{
				int numOfFourShip = playerGrid.numOfFourShip;
				if(numOfFourShip >= 1 ) 
				{
					System.out.println("You can only have one ship with length of 4");
				}
				else 
				{
					s.setDirection(direction);
					s.setLocation(row, col);
					playerGrid.addShip(s);
				}
			}
			if(shipLength == 5) 
			{
				int numOfFiveShip = playerGrid.numOfFiveShip;
				if(numOfFiveShip >= 1 ) 
				{
					System.out.println("You can only have one ship with length of 5");
				}
				else 
				{
					s.setDirection(direction);
					s.setLocation(row, col);
					playerGrid.addShip(s);
				}
			}
		}
	}
	
	public void askForGuess(int row, int col, Player computer) 
	{
		if(computer.playerGrid.alreadyGuessed(row, col)) 
		{
			System.out.println("That point is already guessed");
		}
		else if (row > 9|| row<0 || col>9 || col < 0) 
		{
			System.out.println("That point is not on the grid");
		}
		else 
		{
			boolean pointHasShip = computer.playerGrid.hasShip(row, col);
			if (pointHasShip) 
			{
				System.out.println("Hit!");
				computer.playerGrid.markHit(row, col);
				hitShips++;
				Location thePoint = computer.playerGrid.getLocation(row, col);
				String pointShip = thePoint.getShipType();
				if(pointShip.equals("PatrolBoat")) 
				{
					patrolHits++;
					if(patrolHits == 2) 
					{
						System.out.println("Sunk a patrol boat! (Length 2) ");
					}
				}
				else if(pointShip.equals("Submarine")) 
				{
					submarineHits++;
					if(submarineHits== 3) 
					{
						System.out.println("Sunk a Submarine! (Length 3) ");
					}
				}
				else if(pointShip.equals("Destroyer")) 
				{
					destroyerHits++;
					if(destroyerHits== 3) 
					{
						System.out.println("Sunk a Destroyer! (Length 3) ");
					}
				}
				else if(pointShip.equals("Battleship")) 
				{
					battleshipHits++;
					if(battleshipHits== 4) 
					{
						System.out.println("Sunk a Battleship! (Length 4) ");
					}
				}
				else if(pointShip.equals("Carrier")) 
				{
					carrierHits++;
					if(carrierHits== 5) 
					{
						System.out.println("Sunk a Carrier! (Length 5) ");
					}
				}
			}
			else 
			{
				System.out.println("Miss!");
				computer.playerGrid.markMiss(row, col);
			}
			
		}
	}
	
	public int convertToInt(String alpha) 
	{
		String lowered = alpha.toLowerCase();
		char stringAlpha = lowered.charAt(0);
		int charint = (int)stringAlpha;
		if (97 <= charint && charint <=106) 
		{
			return charint - 97;
		}
		else 
		{
			return 0;
		}
		
	}
	
		public void putDownShip(String guess){
        
        if(guess.indexOf(":") <= -1){
            System.out.println("Check your entry");
        }
        else{
            String[] guessStrings = guess.split(":");
            
            //displayText(guessStrings[0]);
            
            int guessStringLength = guessStrings.length;
            int stringTwoLength = guessStrings[1].length();
            
            if (guessStringLength != 3 || (stringTwoLength != 2 && guessStrings[1].indexOf("10") <= -1)){
                System.out.println("Check your entry");
                
            }
            else{
                int Shiplength = Integer.parseInt(guessStrings[0]);
                
                Ship theShip = new Ship(Shiplength);
                
                String fullSecond = guessStrings[1];
                char secondFirstChar = guessStrings[1].charAt(0);
                String secondSecondPart = fullSecond.replace(""+ secondFirstChar, "");
                int Shiprow = convertToInt("" + secondFirstChar);
                
                int Shipcol = Integer.parseInt(secondSecondPart) - 1;
                String dirgiven = guessStrings[2].toLowerCase();
                int Shipdir = -1;
                if(dirgiven.equals("horizontal")){
                    Shipdir = 0;
                }
                else if (dirgiven.equals("vertical")){
                    Shipdir = 1;
                }
                else{
                	System.out.println("Check your entry");
                    
                }
                if (0 > Shipcol || 11 <= Shipcol || -1 >= Shiprow || 10<= Shiprow){
                	System.out.println("Check your entry");
                    
                    
                }
                else{
                    chooseShipLocation(theShip,Shiprow,Shipcol,Shipdir);
                    
                }
                
                
            }
            
            System.out.println("Current status:");
            printMyShips();
        }
    }
	
	public void printMyShips()
	{
		playerGrid.printShip();
	}
	public void printMyGuesses() 
	{
		playerGrid.printStatus();
	}
	public void printComputerGuesses() 
	{
		computerGrid.printStatus();
	}
	
	public void recordComputerGuess(int row, int col) 
	{
		if (computerGrid.alreadyGuessed(row, col))
		{
			System.out.println("Square is already guessed");
		}
		else 
		{
			boolean theStatus = playerGrid.hasShip(row, col);
			if(theStatus == true) 
			{
				computerGrid.markHit(row, col);
			}
			else 
			{
				computerGrid.markMiss(row, col);
			}
		}
	}
	
	
	
}
