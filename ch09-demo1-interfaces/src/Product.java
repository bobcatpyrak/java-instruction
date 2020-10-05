import java.text.NumberFormat;

// p. 293 - Interfaces
public class Product 
	implements Printable, Cloneable
{	// fields / instance variables
	private String code;
	private String description;
	private double price;
	
	// constructor - empty/default (does not accept parameters)
	public Product()
	{
		
	}
	
	// constructor - fully loaded (fills every field)
	public Product(String code, String description, double price) 
	{
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() 
	{return code;}
	public void setCode(String code)
	{this.code = code;}
	public String getDescription() 
	{return description;}
	public void setDescription(String description) 
	{this.description = description;}
	public double getPrice() 
	{return price;}
	public void setPrice(double price) 
	{this.price = price;}
	
	public String getPriceFormatted()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	@Override
	public String toString() 
	{
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public void print() 
	{
		System.out.println(description);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}	
	

}
