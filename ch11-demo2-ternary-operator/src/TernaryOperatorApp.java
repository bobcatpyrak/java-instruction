
public class TernaryOperatorApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		// Actor example - M or F
		// if gender = "M", genderDisplay = "Male"
		// if gender = "F", genderDisplay = "Female:
		// Output: 'The actor's gender is Female'
		
		String gender = "F";
		String genderDisplay = "";
		
		// non-ternary way
		if(gender.equalsIgnoreCase("m"))
			genderDisplay = "Male";
		else
			genderDisplay = "Female";
		
		System.out.println("The actor's gender is " + genderDisplay);
		
		System.out.println("-------    ternary operator");
		genderDisplay = "";
		genderDisplay = gender.equalsIgnoreCase("M") ? "Male" : "Female";
		System.out.println("The actor's gender is " + genderDisplay);
	}
	
	

}
