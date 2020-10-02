
public class Rectangle extends Square 
{

	double height;
	public Rectangle(double width, double height) 
	{
		super(width);
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	
	public double getArea()
	{
		return width * height;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
}
