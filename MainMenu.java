package AirlineReservationSystem;

import java.util.Scanner;

public class MainMenu {
	
	public static void main (String[]args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your First Name:");
		String firstname=scan.nextLine();
		
		System.out.println("Enter your Last Name:");
		String lastname=scan.nextLine();
		
		System.out.println("Enter your Passport ID:");
		String passportNumb=scan.nextLine();
		
		BasicInfo passenger = new BasicInfo(passportNumb, firstname, lastname);
		
		System.out.println("Where do you want to go?");
		String Destination=scan.nextLine();
			
		System.out.println("What time do you want your flight to be? Format: 00:00 AM/PM");
		int Departure=scan.nextInt(); 
		
		System.out.println();
		VisaInfo.displayVisaInfoMenu(Destination);
		
		scan.nextLine(); 
		
		System.out.println("Are you a vet or served in the military? Yes or No.");
		String militaryDiscount=scan.nextLine();
		double finalTicketPrice = Discount.militaryDiscount(militaryDiscount); 
		
		Payment.processPayment(); 
		
		System.out.println("Ticket booked for " + passenger.getFullName() + " to " + Destination);
	
		Feedback.collectFeedback(); 
		
		
	}

}
