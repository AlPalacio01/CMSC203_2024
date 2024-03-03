import java.util.*;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		
		String newMovie = "";
		
		//scanner object
		Scanner input = new Scanner(System.in);
		
		do { //do-while loop
			
		//Prompt user to enter the name of movie + user input
		System.out.println("Enter the name of a movie");
		String title = input.nextLine();
		
		//Prompt user to enter the rating of the movie + user input
		System.out.println("Enter the rating of the movie");
		String rating = input.nextLine();
		
		//Prompt user to enter the number of tickets sold + user input
		System.out.println("Enter the number of tickets sold for this movie");
		int soldTickets = input.nextInt();
		input.nextLine();//consume next line in buffer

		//create movie object using provided info
		Movie movie = new Movie(title, rating, soldTickets);
	
		//Display details using toString method
		System.out.println(movie.toString());
		
		//prompt user of they want to enter another movie
		System.out.println("Do you want to enter another? ('y' or 'n')");
		newMovie = input.nextLine();
		
		}while(newMovie.equalsIgnoreCase("y"));
		
		//close scanner
		input.close(); 
		
		//Goodbye message
		System.out.println("Goodbye");

	}

}