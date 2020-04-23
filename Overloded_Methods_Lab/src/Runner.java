import java.util.Arrays;

public class Runner 
{
	public static void main(String[] args) 
	{
		Calculator calculator = new Calculator ();
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.add(1.0, 2.0));
		System.out.println(calculator.add(1, 2.0));
		System.out.println(calculator.add(1, 2,3));
		System.out.println(Arrays.toString(calculator.add(new int[]{1,2,4}, 2)));
		System.out.println(calculator.add(new Rectangle(10, 5), new Rectangle (20,5)));
		System.out.println(calculator.subtract(2, 1));
		System.out.println(calculator.subtract(2.0, 1.0));
		System.out.println(Arrays.toString(calculator.subtract(new int [] {1,2,4}, 2.0)));
		System.out.println(calculator.subtract(new Rectangle (10,5), new Rectangle (20,5)));
		System.out.println(calculator.div(4.0, 2.0));
		System.out.println(Arrays.toString(calculator.div(new int []{2,4,6}, 2.0)));
		System.out.println(calculator.div(new Rectangle (10,5), 2.0));
		System.out.println(calculator.div(2, 2.0));
		System.out.println(Arrays.toString(calculator.div(new int [] {1,2,4}, 2)));
		System.out.println(calculator.mult(2.0, 2.0));
		System.out.println(calculator.mult(new Rectangle (10,5), 2.0));
		System.out.println(calculator.mult(2,"temp"));
		System.out.println(calculator.mult(0.5, "test"));
	}

}
