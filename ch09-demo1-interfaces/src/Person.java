
public class Person 
{
	protected String firstName;
	protected String lastName;
	
	public Person()
	{
		
	}
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
	
	public String getName()
	{
		return firstName;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + firstName + " " + lastName;
	}
}
