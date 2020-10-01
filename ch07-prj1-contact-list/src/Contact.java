
public class Contact {

	String firstName;
	String lastName;
	String email;
	String phone;
	
	public Contact()
	{
		
	}
	
	public Contact(String firstName, String lastName, String email, String phone)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void newContact()
	{
		firstName = Console.getString("Enter first name:\t");
		// System.out.print("Enter first name:\t");
		// firstName = kb.nextLine();
		lastName = Console.getString("Enter last name:\t");
		// System.out.print("Enter last name:\t");
		// lastName = kb.nextLine();
		email = Console.getString("Enter email: \t\t");
		// System.out.print("Enter email: \t\t");
		// email = kb.nextLine();
		phone = Console.getString("Enter phone: \t\t");
		// System.out.print("Enter phone: \t\t");
		// phone = kb.nextLine();
		System.out.println();
	}
	
	public String displayContact()
	{
		String str = "--------------------------------------------\r\n" + 
				"---- Current Contact -----------------------\r\n" + 
				"--------------------------------------------\n" +
				"Name:\t\t" + firstName + " " + lastName + "\n" +
				"Email Address:\t" + email +"\n" +
				"Phone Number:\t" + phone + "\n" +
				"--------------------------------------------";
		/*System.out.println("--------------------------------------------\r\n" + 
				"---- Current Contact -----------------------\r\n" + 
				"--------------------------------------------");
		System.out.println("Name:\t\t" + firstName + " " + lastName);
		System.out.println("Email Address:\t" + email);
		System.out.println("Phone Number:\t" + phone);
		System.out.println("--------------------------------------------");*/
		
		return str;
	}
}
