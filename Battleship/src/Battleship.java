import java.util.*;
import java.util.*;
import java.io.*;


public class Battleship 
{
	Player player = new Player();
	boolean playerContinue = false;
	Player Computer = new Player();
	boolean computerContinue = false;
	
	boolean guessStage = true;
	boolean playerStageGuess = true;
	boolean computerStageGuess = true;
	boolean playerGuess = true;
	public String [] directions = {"horizontal", "vertical"};
	
	Scanner scanner = new Scanner(System.in);
	public String readLine(String text) 
	{
		System.out.print(text);
		String out = scanner.next();
		return out;
	}

	public void randomGuess() 
	{
		boolean computerisGuessing = true;
		while(computerisGuessing) 
		{
			int random1 = (int) (Math.random()*10);
			int random2 = (int) (Math.random()*10);
			char row = (char)(65 + random1);
			int colNum = random2 + 1;
			if(player.playerGrid.alreadyGuessed(random1, random2)) 
			{
				
			}
			else 
			{
				System.out.println("Computer guessed " + row + colNum);
				Computer.askForGuess(random1, random2, player);
				computerisGuessing = false;
			}
		}
	}

	public void getGuess(String guess) 
	{
		if(guess.length() !=2 && guess.length() !=3)
		{
			System.out.println("Check your entry");
		}
		else 
		{
			String char1 = "" + guess.charAt(0);
			int rowNum = player.convertToInt(char1);
			int colNum = (Integer.parseInt(guess.replace(char1, "")) -1);
			if(rowNum < 0 || rowNum > 9 || colNum < 0 || colNum > 9)
			{
				System.out.println("Check your entry");
			}
			else 
			{
				if(Computer.playerGrid.alreadyGuessed(rowNum, colNum)) 
				{
					System.out.println("That space has already been guessed.");
				}
				else 
				{
					player.askForGuess(rowNum, colNum, Computer);
					playerGuess = false;
				}
			}
		}
	}
	
	public void runner() 
	{
		System.out.println("Welcome to battleship By Abhay ");
		System.out.println();
		System.out.println("This is your battleship board. Let's place your ships.");
		System.out.println();
	    player.printMyShips();
	    Scanner enter = new Scanner(System.in);
	    System.out.print("\n\nPRESS ENTER TO PLAY\n");
	    String wait = enter.nextLine();
        System.out.println("Add a ship using this format:");
        System.out.println("Shiplength:StartingLocation:direction");
        System.out.println("For example: 4:A3:vertical");
        System.out.println("Type 'shipsleft' to see how many ships you have to add.");
	    
	    while(playerContinue == false)
	    {
	    	String shipPlace = readLine("Add a ship: ").toLowerCase();
	    	if(shipPlace.equals("shipsleft") || shipPlace.contentEquals("'shipsleft'"))
	    	{
	    		int totalShips = player.playerGrid.totalShips;
	    		int shipsLeft = 5 - totalShips;
	    		System.out.println("You still need to add " + shipsLeft +" more ships!" );
	    	}
	    	else 
	    	{
	    		player.putDownShip(shipPlace);
	    	}
	    	
	    	if(player.playerGrid.totalShips == 5) 
	    	{
	    		System.out.println("You have placed all of your ships.");
	    		playerContinue = true;
	    	}
	    	
	    }
	    System.out.println("Please wait for computer to place its ships");
	    
	    while(computerContinue == false)
	    {
	    	int [] shipLengths = {2,3,3,4,5};
	    	int randomShipLength = (int) (2+Math.random()*4);
	    	int charNum = 97 + (int) (Math.random()*10);
	    	char randomShip = (char)charNum;
	    	int colNum = (int) (1+Math.random()*10);
	    	int directionNum = (int) (4+Math.random()*4);
	    	int direcNum = 0;
	    	if(directionNum == 4 || directionNum == 7) 
	    	{
	    		direcNum = 1;
	    	}
	    	String shipDirection = directions[direcNum];
	    	String shipPlace = "" + randomShipLength + ":" + randomShip + colNum + ":" + shipDirection;
	    	Computer.showOutput = false;
	    	Computer.playerGrid.showOutput = false;
	    	Computer.putDownShip(shipPlace);
	    	if(Computer.playerGrid.totalShips == 5);
	    	System.out.println("The computer is thinking");
	    	System.out.println("Your opponent has put all ships down!");
	    	Computer.showOutput = true;
	    	Computer.playerGrid.showOutput = true;
	    	computerContinue = true;
	    }
	    
	    while(guessStage) 
		{
			while(playerGuess) 
			{
				System.out.println("Current Computer Grid:");
				Computer.playerGrid.printStatus();
				String guess = readLine("Enter Your Guess");
				getGuess(guess);
				if(player.hitShips == 17) 
				{
					guessStage = false;
					System.out.println("You Won!");
				}
				else if(Computer.hitShips == 17) 
				{
					guessStage = false;
					System.out.println("Computer Won!");
				}
				
				
			}
			System.out.println("Current Computer Grid: ");
			Computer.playerGrid.printStatus();
			System.out.println("The Computer is guessing");
			randomGuess();
			
			System.out.println("Your current grid:");
			player.playerGrid.printStatus();
			playerGuess = true;
			
			if(player.hitShips == 17) 
			{
				guessStage = false;
				System.out.println("You Win!");
			}
			else if(Computer.hitShips == 17) 
			{
				guessStage = false;
				System.out.println("Computer Won!");
			}
			
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		Battleship BattleshipGame = new Battleship();
		BattleshipGame.runner();

	}

}
