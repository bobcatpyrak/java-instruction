package business;

public class Movie 
{
	int id;
	String title;
	String year;
	String rating;
	String director;
	
	public Movie()
	{
		
	}
	
	public Movie(int id, String title, String year,	String rating, String director)
	{
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
	}
	
	public String displaySummary()
	{
		return title + " (" + rating + ") was released in " + year + ". Director(s): " + director;
	}
	
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getYear() 
	{
		return year;
	}
	public void setYear(String year) 
	{
		this.year = year;
	}
	public String getRating() 
	{
		return rating;
	}
	public void setRating(String rating) 
	{
		this.rating = rating;
	}
	public String getDirector() 
	{
		return director;
	}
	public void setDirector(String director) 
	{
		this.director = director;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
