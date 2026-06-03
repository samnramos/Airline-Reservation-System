package AirlineReservationSystem;

public class Discount {
	public static void main (String [] args) {
		militaryDiscount("No");
	}
	public static double militaryDiscount(String militaryStatus)
	{
		double ticketprice = 450.00;
		
		if (militaryStatus.equalsIgnoreCase("Yes")) 
		{
			double finalprice = ticketprice*0.25;
			System.out.println("Discount Applied");
			System.out.println("Your Ticket is: $"+finalprice);	
			return finalprice;
		}
		else
		{
			System.out.println("Your Price is: $"+ticketprice);
			return ticketprice;
		}
	}

}
