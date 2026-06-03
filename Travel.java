package AirlineReservationSystem;

public class Travel {
	private String Destination;
	private int FlightNumber;
	private int Arrival;
	private int Departure;
	private int Price;
	private int AvailableSeats; 
	
	public Travel(String Destination, int FlightNumber, int Arrival, int Departure, int Price, int AvailableSeats)
	{
		this.Destination = Destination;
		this.FlightNumber = FlightNumber;
		this.Arrival = Arrival;
		this.Departure = Departure;
		this.Price = Price;
		this.AvailableSeats = AvailableSeats;
	}
	
	public String Destination()
	{
		return Destination;
	}
	public int FlightNumber(int ard)
	{
		return FlightNumber;
	}
	public int Arrival(int ard)
	{
		return Arrival;
	}
	public int Departure(int ard)
	{
		return Departure;
	}
	public int Price(int ard)
	{
		return Price;
	}
	public int AvailableSeats(int ard)
	{
		return AvailableSeats;
	}

}
