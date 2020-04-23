import java.util.Scanner;

public class Mini_Project_1 {

	public static void main(String[] args) 
	{
		
		
		Scanner read = new Scanner(System.in);
		System.out.println("Final Grade Calculator");
		System.out.println("What percent do you want in the class:");
		double Goal = read.nextDouble();
		System.out.println("Percentage in class currently:");
		double Now = read.nextDouble();
		System.out.println("Weight of the test(20 for 20%):");
		double weight = read.nextDouble();
		
		
		double Final = ((Goal - Now * (1 - (weight/100)))/(weight/100));
		if (Final > 100)
		{
			System.out.println("This is impossible");
		}
		else
		{
			System.out.println("The percent you need on the final to get a " + Goal + "% is: " + Final + "%" );
		}

	}

}