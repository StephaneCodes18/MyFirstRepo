package smbenga_Assignment_2_sourcefiles;
import java.util.Scanner;
public class RandomNumberGuesser {
/**
 * The driver class allows a user to guess a random number that is generated by the RNG class, until the user guesses the random number the program will
 * restrict the range the random number it is in and allow the user to keep guessing 
 * @param args
 */
	public static void main(String[] args) 
	{
		RNG.scan = new Scanner(System.in); //declare input stream so user can enter data
		char userChoice;// to hold user choice based on if they want to play again
		int randNum; //To hold random number generated by RNG class
		int nextGuess, lowGuess = 0, highGuess = 100; //to hold user guess, and the minimum and maximum values of the guesses
		
		
	do {
		
		randNum = RNG.rand(); // get a random number and store it
		
		System.out.println("Enter your first guess, guess must be between 1 and 100");
		nextGuess = RNG.scan.nextInt(); //store users guess
		 
		nextGuess = guessChecker(nextGuess, lowGuess, highGuess, RNG.scan);
		
		System.out.println("Number of guesses: "+ RNG.getCount());
		
		//repeatedly check is user's guess is right and exit if it is, if not restrict the range and ask user to guess again
		while(nextGuess!=randNum) //
		{
			if(nextGuess<randNum) 
			{
				
				System.out.println("Guess is to low"); //if guess is too low ask user to try again 
				lowGuess = nextGuess; //lower the range
				System.out.println("Enter your guess between " + lowGuess + " and " + highGuess);
				nextGuess = RNG.scan.nextInt();
				nextGuess = guessChecker(nextGuess, lowGuess, highGuess, RNG.scan);
				System.out.println("Number of guesses: "+ RNG.getCount());
			}
			else if(nextGuess>randNum) //if guess is to high ask user too try again
			{
				System.out.println("Guess is to high");
				highGuess = nextGuess; //lower the range
				System.out.println("Enter your guess between " + lowGuess + " and " + highGuess);
				nextGuess = RNG.scan.nextInt();
				nextGuess = guessChecker(nextGuess, lowGuess, highGuess, RNG.scan);
				System.out.println("Number of guesses: "+ RNG.getCount());
			}
			else 
				break;
			
		}
	
	System.out.println("Congratulations, you guessed correctly."); //congratulate user
	
	System.out.println("Try again or no?. Enter (Y for yes and N for no)"); //ask if user wants to play again
	RNG.scan.nextLine(); // store user choice
	userChoice = RNG.scan.nextLine().charAt(0);//store user's answer
	
	RNG.resetCount(); //reset number of times user has guessed
	lowGuess = 0; //reset minimum guess of a value
	highGuess = 100; //reset maximum guess of a value
	}while(userChoice == 'Y' || userChoice == 'y');
	
	RNG.scan.close(); //close input stream
	System.out.println("Goodbye!");
	System.out.println("Programmer's Name: Stephane Mbenga");
	}
	
	//methods outside of main
	/**
	 * Checks whether the users guess is within the range using RNG class and, and keeps asking user to enter a number until it is valid
	 * @param userGuess - to hold the user guess
	 * @param lowGuess - to hold the minimum value of a guess that is passed as an argument
	 * @param highGuess - to hold the maximum value of a guess that is passed as an argument
	 * @param keyboard - to allow data to be entered 
	 * @return -  the user Guess that is within range
	 */

	public static int guessChecker(int userGuess, int minGuess, int maxGuess, Scanner input) {
	
		boolean guessisWithinRange = RNG.inputValidation(userGuess, minGuess, maxGuess); // validate users input
		
		while((!guessisWithinRange))//while the guess is not within the range keep asking the user to enter a number{
		{
		userGuess = input.nextInt();
		guessisWithinRange = RNG.inputValidation(userGuess, minGuess, maxGuess);
		}
		return userGuess;
	}
}