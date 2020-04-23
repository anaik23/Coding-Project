import java.util.Scanner;

public class Spendings_Account 
{
	private static String password;
	private static double balance;
	
	Spendings_Account(String p, double b)
	{
		System.out.println("This is Your Spending Account.");
		password = p;
		balance = b;
	}
	public static void SetPassword(String UI) 
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter your temporary password.");
		UI = read.nextLine();
		int attempts = 2;
		while(attempts >=0) 
		{
			if (UI.equals(password))
			{
				System.out.println("Please create a new Password: ");
				password = read.nextLine();
				System.out.println("Your password has been successfully changed.");
				attempts = -1;
			}
			else if (attempts == 0) 
			{
				System.out.println("The password you entered is wrong. You have been locked out of your account.");
				attempts = -1;
				System.exit(0);
			}
			else 
			{
				System.out.println("The password you have entered is wrong. Please try again. You have " + attempts + " attempts left." );
				UI= read.nextLine();
				attempts --;
			}
			
		}
	}
	public void deposit (double d) 
	{
		Scanner read1 = new Scanner(System.in);
		System.out.println("Please enter your password.");
		String DP = read1.nextLine();
		int attempts = 2;
        while(attempts >= 0)
        {
            if(DP.equals(password))
            {
            	balance += d;
                System.out.println("You have deposited $" + d);
                attempts = -1;
                
            }
            else if(attempts == 0)
            {
                System.out.println("Sorry, you have been locked out ");
                attempts = -1;
                System.exit(0);
            }
            else  
            {
                System.out.println("Try again. You have " + attempts + " attempts remaining: ");
                DP = read1.nextLine();
                attempts--;
            }
            
        }
        
	}
        
        public void withdraw (double d) 
		{
			Scanner read2 = new Scanner(System.in);
			System.out.println("Please enter your password.");
			String WP = read2.nextLine();
			int attempts = 2;
            while(attempts >= 0)
            {
                if(WP.equals(password))
                {
                	balance -= d;
                    System.out.println("You withdrew $" + d );
                    attempts = -1;
                    
                }
                else if(attempts == 0)
                {
                    System.out.println("Sorry, you have been locked out ");
                    attempts = -1;
                }
                else  
                {
                    System.out.println("Try again. You have " + attempts + " attempts remaining: ");
                    WP = read2.nextLine();
                    attempts--;
                }
            }
            

		}
        public double getBalance() 
        {
        	System.out.println("Your balance is: " + balance);
        	return balance;
        }
		
}


