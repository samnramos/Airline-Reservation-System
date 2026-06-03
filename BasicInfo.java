package AirlineReservationSystem;

public class BasicInfo {
	
	private String passportNumb;
	 private String firstname;
	 private String lastname;
	 
	 public BasicInfo(String passportNumb, String firstname, String lastname) 
	 {
		 this.passportNumb = passportNumb;
		 this.firstname = firstname;
		 this.lastname = lastname;
	 }
	 
	 public String getPassportNumb() 
	 {
		 return passportNumb;
	 }
	 
	 public String getFirstnName() 
	 {
		 return firstname;
	 }
	 
	 public String getLastName()
	 {
		 return lastname;
	 }
	 public String getFullName()
	 {
		 return firstname+" "+lastname;
	 }

}
