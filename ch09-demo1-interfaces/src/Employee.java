
public class Employee extends Person implements Printable, DepartmentConstants
{
	private String ssn;
	private int dept;
	
	public Employee() 
	{
		
	}

	public Employee(String firstName, String lastName, String ssn, int dept) 
	{
		super(firstName, lastName);
		this.ssn = ssn;
		this.dept = dept;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nSSN: XXX-XX-" + ssn.substring(7);
	}

	// return firstName lastName (deptDescription)
	@Override
	public void print() 
	{
		String department = "Unknown";
		if (dept == ADMIN)
			department = "Administration";
		else if (dept == EDITORIAL)
			department = "Editorial";
		else if (dept == MARKETING)
			department = "Marketing";
		System.out.println(firstName + " " + lastName + " (" + department + ")");
	}
}
