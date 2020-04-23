import java.util.ArrayList;

public class GameHelper 
{
	private static final String alphabet = "abcdefg";
	private int gridLength =7;
	private int gridSize = 49;
	private int [] grid = new int [gridSize];
	private int shipCount = 0;


	public ArrayList<String> placeShip(int shipSize)
	{
		ArrayList<String> alpha = new ArrayList<String>();
		String[] alphacordinate = new String[shipSize];
		String temp = null;
		int [] coords = new int [shipSize];
		int attempts =0;
		boolean success = false;
		int location =0;
		
		shipCount++;
		int incr =1;
		if ((shipCount % 2) == 1) {
			incr = gridLength;
		}
		
		while(!success & attempts++ <200) 
		{
			location = (int) (Math.random() * gridSize);
			int x =0;
			success = true;
			while (success && x<shipSize) 
			{
				if (grid[location] == 0) 
				{
					coords[x++] = location;
					location += incr;
				}
				if (location >= gridSize) 
				{
					success = false;
				}
				if (x>0 && (location % gridLength == 0)) {
					success = false;
				}
				else 
				{
					success = false;
				}
			}
		}
		int x =0;
		int row =0;
		int col =0;
		while (x<shipSize) 
		{
			grid[coords[x]] = 1;
			row = (int) (coords[x]/gridLength);
			col = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(col));
			alpha.add(temp.concat(Integer.toString(row)));
			
		}
		return alpha;
	}

}
