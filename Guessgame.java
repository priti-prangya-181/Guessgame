import java.util.Scanner;
import java.util.Random;

public class Guessgame{
	public static void main(String[] args) {
     generateRandom();
	}
	public static void generateRandom()
	{
		Random rand=new Random();

		int randomNum=rand.nextInt(11);
		guess(randomNum);
	}

	public static void guess(int randomNum)
	{
	
	Scanner in=new Scanner(System.in);

		System.out.println("");
		System.out.println("Number Guessing Game");
		System.out.println("Guess a number between 0-10; ");
		int guess=in.nextInt();
		System.out.println("");

		while(guess<0|| guess>10)
		{
			System.out.println("Guess a number between 0-10");
			guess=in.nextInt();
			System.out.println("");
		}
		int tries=0;
		while(guess!=randomNum)
		{
			tries++;
			System.out.println("Wrong Guess!");
			System.out.println("Guess again:");
			guess=in.nextInt();
			System.out.println("");

			while(guess<0 || guess>10)
			{
				System.out.println("Guess a number between 0-10:");
				guess=in.nextInt();
				System.out.println("");
			}
		}
		System.out.println("correct Answer.you won!");
		System.out.println("Wrong Tries:"+tries);
		System.out.println("");
		System.out.println("press 1 to play again");
		System.out.println("press 0 to exit");
		int choice=in.nextInt();
		if(choice==1)
			generateRandom();
		else 
			return;

	} 
}