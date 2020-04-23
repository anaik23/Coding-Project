import java.util.Scanner;

public class Blackjack_Runner
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Mr. Lee's Blackjack Casino!");
		System.out.println("Would you like to play Blackjack against me?");
		Scanner read = new Scanner(System.in);
		String run = read.next();		// Reads next input as a String
		boolean game_on = false;


		if (run.compareToIgnoreCase("yes") == 0)		// checks to see if the the user's input is yes or YES or YeS or yES
		{
			game_on = true;
		}
		else 
		{
			System.exit(0);
		}
		

		
		Deck theDeck = new Deck(1, true);
		Player me = new Player("Abhay");
		Player dealer = new Player ("Dealer");
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		System.out.println("Cards are delt\n");
		me.printHand(true);
		dealer.printHand(false);
		System.out.println("\n");
		boolean meDone = false;
		boolean dealerDone = false;
		String ans;
		while (!meDone || !dealerDone) 
		{
			if (!meDone) 
			{
				System.out.print("Hit or Stay? (Enter H or S): ");
				ans = read.next();
				System.out.println();
			if (ans.compareToIgnoreCase("H") == 0) 
			{
				meDone = !me.addCard(theDeck.dealNextCard());
				me.printHand(true);
			}
			else 
			{
				meDone = true;
			}
		}
		if (!dealerDone) 
		{
			if (dealer.getHandSum() < 17) 
			{
				System.out.println("The Delear hits\n");
				dealerDone = !dealer.addCard(theDeck.dealNextCard());
				dealer.printHand(false);
			}
			else 
			{
				System.out.println("The Dealer stays\n");
				dealerDone = true;
			}
		}
		System.out.println();
	
		
	}
		read.close();
		me.printHand(true);
		dealer.printHand(true);
		int mySum = me.getHandSum();
		int dealerSum = dealer.getHandSum();
		
		if (mySum > dealerSum && mySum <=21 || dealerSum > 21) 
		{
			System.out.println("You Win !");
		}
		else 
		{
			System.out.println("Dealer Wins !");
		}
	
}

}
	


