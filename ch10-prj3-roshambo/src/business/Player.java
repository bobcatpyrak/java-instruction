package business;

public abstract class Player 
{
	private String name;
	private Roshambo ros;
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getRos() {
		return ros;
	}

	public void setRos(Roshambo ros) {
		this.ros = ros;
	}
	
	
}
