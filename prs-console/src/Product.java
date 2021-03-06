
public class Product 
{
	private int id;
	//private int vendorId;
	private String partNumber;
	private String name;
	private String price;
	private String unit;
	private String photoPath;
	
	public Product()
	{
		
	}
	
	public Product (int id, String partNumber, String name, String price, String unit, String photoPath)
	{
		this.id = id;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	public String toString()
	{
		return "Product summary: " +
				"\n ID: " + id +
				"\n Part Number: " + partNumber + 
				"\n Name: " + name +
				"\n Price: " + price+
				"\n Unit: " + unit +
				"\n Photo Path: " + photoPath;	
	}
	
}
