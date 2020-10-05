

public class PrsConsoleApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the PRS Console App!/n");

		System.out.println("Menu\r\n" + 
				"1 - Add User\r\n" + 
				"2 - Add Vendor\r\n" + 
				"3 - Add Product\r\n" + 
				"4 - Add Request\r\n" + 
				"5 - Add Line Item\r\n" + 
				"6 - Exit\r\n");
		
		String choice = Console.getString("Command: ");
		System.out.println();
		
		switch(choice)
		{
		case "1":
			User u = new User();
			System.out.println("Add a user:");
			u.setId(Console.getInt("ID: "));
			u.setUserName(Console.getRequiredString("Username: "));
			u.setPassword(Console.getRequiredString("Password: "));
			u.setFirstName(Console.getRequiredString("First Name: "));
			u.setLastName(Console.getRequiredString("Last Name: "));
			u.setEmail(Console.getRequiredString("Email Address: "));
			u.setReviewer(Console.getBoolean("Is this user a Reviewer?: "));
			u.setAdmin(Console.getBoolean("Is Admin?: "));
			System.out.println(u);
			break;
		case "2":
			Vendor v = new Vendor();
			System.out.println("Add a vendor:");
			v.setId(Console.getInt("ID: "));
			v.setCode(Console.getRequiredString("Code: "));
			v.setName(Console.getRequiredString("Name: "));
			v.setAddress(Console.getRequiredString("Address: "));
			v.setCity(Console.getRequiredString("City: "));
			v.setState(Console.getRequiredString("State: "));
			v.setZip(Console.getRequiredString("Zip code: "));
			v.setPhoneNumber(Console.getRequiredString("Phone Number: "));
			v.setEmail(Console.getRequiredString("Email Address: "));
			System.out.println(v);
			break;
		case "3":
			Product p = new Product();
			System.out.println("Add a product:");
			p.setId(Console.getInt("ID: "));
			p.setPartNumber(Console.getRequiredString("Part Number: "));
			p.setName(Console.getRequiredString("Name of Product: "));
			p.setPrice(Console.getRequiredString("Price: "));
			p.setUnit(Console.getString("Unit: "));
			p.setPhotoPath(Console.getString("Photo File Path: "));
			System.out.println(p);
			break;
		case "4":
			Request r = new Request();
			System.out.println("Add a request:");
			r.setId(Console.getInt("ID: "));
			r.setDescription(Console.getRequiredString("Describe your request?: "));
			r.setJustification(Console.getRequiredString("Justify your request: "));
			r.setDateNeeded(Console.getRequiredString("Needed by what date?: "));
			r.setDeliveryMode(Console.getRequiredString("Delivery mode?: "));
			r.setStatus(Console.getString("Status? (leave blank if new): "));
			r.setTotal(Console.getDouble("Total price of request: "));
			r.setSubmittedDate(Console.getString("Date request put in (leave blank for current date): "));
			System.out.println(r);
			break;
		case "5":
			LineItem li = new LineItem();
			System.out.println("Add a line item:");
			li.setId(Console.getInt("ID: "));
			li.setQuantity(Console.getInt("Quantity: "));
			System.out.println(li);
			break;
		default:
			break;
		}
		
		System.out.println("Bye!");
	}
}
