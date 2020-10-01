import java.text.NumberFormat;

public class Rectangle {

	double length;
	double width;
	
	public Rectangle ()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea()
	{
		return (width*length);
	}
	public String getAreaString()
	{
		NumberFormat formo = NumberFormat.getNumberInstance();
		formo.setMaximumFractionDigits(3);
		
		return formo.format(width*length);
	}
	public double getPerimeter()
	{
		return ((length*2)+(width*2));
	}
	public String getPerimeterString()
	{
		NumberFormat formo = NumberFormat.getNumberInstance();
		formo.setMaximumFractionDigits(3);
		return formo.format((length*2)+(width*2));
	}
	
}
