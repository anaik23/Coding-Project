import java.util.Scanner;
public class Kiosk_RunnerClass 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to High Tide Bank");
		Checking();
		Saving();
		Spending();
	}
	
	
	
	
	static void Checking() 
	{
		Checkings_Account checking = new Checkings_Account("0zero1one2", 0);
		checking.SetPassword("0zero1one2");
		checking.deposit(4200);
		checking.withdraw(4200);
		checking.getBalance();
	}
	static void Saving() 
	{
		Savings_Account saving = new Savings_Account("0zero1one2", 0);
		saving.SetPassword("0zero1one2");
		saving.deposit(2500);
		saving.getBalance();
	}
	static void Spending() 
	{
		Spendings_Account spending = new Spendings_Account("0zero1one2", 0);
		spending.SetPassword("0zero1one2");
		spending.deposit(400);
		spending.getBalance();
	}
}
