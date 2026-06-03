package AirlineReservationSystem;
import java.util.Scanner;

public class Feedback {
	public static void collectFeedback() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Customer Feedback:");
		System.out.println("How would you like to rate your experience? (1-5 stars)");
		int rating = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Any additional comments?");
		String comments = scan.nextLine();
		
		System.out.println("Thank you for your feedback! Have a safe flight!");
	}
	
}
