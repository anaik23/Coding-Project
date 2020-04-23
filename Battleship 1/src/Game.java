import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
	private ArrayList<Ship> listOfShips = new ArrayList<Ship>();
	private int numGuesses = 0;
	private Scanner keyboard = new Scanner(System.in);
	private GameHelper helper = new GameHelper();
	
	private void setUpGame() 
	{
		Ship shipOne = new Ship();
		shipOne.setName("SS Enterprise");
		Ship shipTwo = new Ship();
		shipOne.setName("SS Nimitz");
		Ship shipThree = new Ship();
		shipOne.setName("SS Bradley");
		listOfShips.add(shipOne);
		listOfShips.add(shipTwo);
		listOfShips.add(shipThree);
		
		System.out.println("Your goal is to sink three Ships.");
		System.out.println("Try to sink them in the fewest guesses");
		
		for (Ship ship : listOfShips) 
		{
			ArrayList<String> location = helper.placeShip(3);
			ship.setLocation(location);
		}
	}
	
	
	private void startPlaying() 
	{
		while(!listOfShips.isEmpty()) {
			String userGuess = getUserInput();
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess) 
	{
		numGuesses++;
		String result = "miss";
		for(Ship ship : listOfShips) 
		{
			result = ship.checkYourself(userGuess);
			if(result.equalsIgnoreCase("hit")) {
				break;
			}
			if(result.equalsIgnoreCase("sink")) {
				listOfShips.remove(ship);
				break;
			}
		}
	}
	
	private void finishGame() 
	{
		System.out.println("All ships have been sunk");
		System.out.println("It took you " + numGuesses + "guesses.");
	}
	
	private String getUserInput() 
	{
		String guess = keyboard.nextLine();
		return guess;
	}
	
	
	public static void main(String[] args) 
	{
		Game game = new Game();
		game.setUpGame();
		game.startPlaying();
	}
}
