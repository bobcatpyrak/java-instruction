
public class Actor 
{
	String firstName;
	String lastName;
	String gender;
	String birthdate;
	
	public Actor()
	{
		
	}
	
	public Actor(String firstName, String lastName,	String gender, String birthdate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	public String displaySummary()
	{
		return firstName + " " + lastName + ", " + gender + ", " + birthdate;
	}
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
}
