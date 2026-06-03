package AirlineReservationSystem;
import java.util.Scanner;
public class Payment {
	public static void processPayment()
	{
		Scanner scan=new Scanner(System.in);
		String Paymentchoice;
		String Cardholder;
		String Cardnumber;
		String CVV;
		String BillAdressing;
		
		System.out.println();
		System.out.println("How would you like to pay: ");
		Paymentchoice = scan.nextLine();
		
		System.out.println("Enter the name on the card: ");
		Cardholder = scan.nextLine();
		
		System.out.println("Enter your credit card number: ");
		Cardnumber = scan.nextLine();
		
		System.out.println("Enter your security code: ");
		CVV = scan.nextLine();
		
		System.out.println("Enter your billing address: ");
		BillAdressing = scan.nextLine();
		
		if (Cardnumber.length() >= 15 && Cardnumber.length() <= 16 && CVV.length() >= 3)
		{
			System.out.println("Processing Payment...");
			System.out.println("Sucess! Thank you, "+ Cardholder);
		}
		else 
		{
			System.out.println("Invalid Card or CVV...");
			System.out.println("The Program will exit now");
			System.exit(0);
		}
		
	}

}
