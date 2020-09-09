import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
	Scanner keyboard  = new Scanner(System.in);
	Movie movie = new Movie();
	char userChoice;
	
do {
	
	System.out.println(" Enter the title of a movie");
	movie.setTitle(keyboard.nextLine());
	
	System.out.println(" Enter the rating of a movie");
	movie.setRating(keyboard.nextLine());
	

	System.out.println(" How many tickets were sold at the theater");
	movie.setSoldTickets(keyboard.nextInt());
	
	System.out.println(movie.toString());
	
	
	
	keyboard.nextLine();
	System.out.println("Do you want to enter another? (y or n)");
	userChoice = keyboard.next().charAt(0);

	keyboard.nextLine();
	
 }while(userChoice == 'y'|| userChoice == 'Y');
	
	System.out.println("Goodbye");
	keyboard.close();
	}

}
