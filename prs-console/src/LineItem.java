
public class LineItem 
{
	int id;
	// int requestId;
	// int produceId;
	int quantity;
	
	public LineItem()
	{
		quantity = 1;
	}

	public LineItem(int id, int quantity)
	{
		this.id = id;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString()
	{
		return "Line Item summary:" +
				"\n ID: " + id +
				"\n Quantity: " + quantity;
	}
}
