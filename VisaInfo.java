package AirlineReservationSystem;

public class VisaInfo {
	public static void displayVisaInfoMenu(String country)
	{
		System.out.println("International Visa Info Menu: ");
		if (country == null) 
		{
			System.out.println("Desitination: Unknown");
			System.out.println("Visa Statu: Warning, Visa requirements vary for null.");
			return;
		}
		System.out.println("Desitination: " + country);
		
		switch (country.toLowerCase()) 
		{
		case "united kingdom":
		case "uk": 
			System.out.println("Visa Status: Exemption rules apply for tourism under 6 months.");
			break;
		case "japan":
			System.out.println("Visa Status: No visa required for short-term tourist stays up to 90 days.");
			break;
		case "france":
		case "germany":
		case "italy":
			System.out.println("Visa Status: 90 day tourist limit.");
		default:
			System.out.println("Visa Status: Warning, Visa requirements vary for " + country + ".");
			break;
		}
	}

}
