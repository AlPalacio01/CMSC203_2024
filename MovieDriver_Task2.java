import java.util.*;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		
		String newMovie = "";
		
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Enter the name of a movie");
		String title = input.nextLine();
		
		System.out.println("Enter the rating of the movie");
		String rating = input.nextLine();
		
		System.out.println("Enter the number of tickets sold for this movie");
		int soldTickets = input.nextInt();
		input.nextLine();

		
		Movie movie = new Movie(title, rating, soldTickets);
	
		
		System.out.println(movie.toString());
		System.out.println("Do you want to enter another? ('y' or 'n')");
		newMovie = input.nextLine();
		
		}while(newMovie.equalsIgnoreCase("y"));
		input.close(); 
		System.out.println("Goodbye");

	}

}