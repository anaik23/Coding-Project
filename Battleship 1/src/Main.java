import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		Ship game = new Ship();
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		game.setLocation(locations);
		String userGuess = "2";
		String result = game.checkYourself(userGuess);
		String testResult ="failed";
		if(result.equalsIgnoreCase("hit")) {
			testResult = "passed";
			
		}
		System.out.println(testResult);
		

	}

}
