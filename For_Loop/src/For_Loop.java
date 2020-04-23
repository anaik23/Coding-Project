import java.util.Scanner;

public class For_Loop
{
	// main is now placed at the bottom of the code. This is good coding practice.

	static void Example_1()
	{
		System.out.println("Example 1:");
	
		for (int i = 1; i <9 ; i++)
		{
			System.out.print(i + ",");
			
			
			
		}
		System.out.print("9");
	}

	static void Example_2()
	{
		System.out.print("\nExample 2:");

		// This code is supposed to find all numbers that are less than the input number that are divisible by 5.
		
		System.out.print("Enter a number: ");
		
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		int count = 0;
		
		int i;
		for (i = number-1; i > 0; i -= 1)
		{
			if ( i%5 == 0 )
			{
				
				count++;
				System.out.println(i);
			}
		}
		System.out.println("There are " + count + " numbers that are less than " + number +
				" and are divisible by 5");
		// If you look above, you can split the print line statement into two lines.
		// It's just a formatting preference if your line of code becomes too long.

	}
	
	static void Example_3() 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int mystery = 1;
		for (int i = num; i >= 0; i--)
		{
			mystery *= i;
		}
		System.out.println("The mystery number is" + mystery);
	}
	
	static void Example_4() 
	{
		System.out.println("Example 4:");
		// Find the factors of the input number.
		System.out.print("Number:");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		System.out.println("The factors of " +  num  + " are: ");
		// Write the for-loop here below
		while (num < 0)
		{
			 System.out.print("please enter a POSITIVE number:" );
			 num = read.nextInt();
		
		}
		for (int i =1; i<num;i++) 
		{
			if (num%i== 0) 
			{
				System.out.print(i + "," );
				
			}
			
		}	
		System.out.print(num);
		if (num == 0)
		{
			System.out.print(" has no factors");
		}
		
	
		
	}
	
	static void Your_Own_Code() 
	{
		// Write a for-loop to test if the user's number is prime.
		System.out.print("Enter number:");
		Scanner read = new Scanner(System.in);
		int count = 0;
		int num = read.nextInt();
		for (int i =2; i<=num/2; i++)
		{
			if (num%i==0) 
			{
				count++;
				
			}
		}
		if (count ==0)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
		
	}
	

	public static void main(String[] args) 
	{
		//To run any of the examples, uncomment the method call
		//Example_1(); 
		//Example_2();
		Example_3();
		//Example_4();
		//Your_Own_Code();
		
	}
}