
public class Movie 
{
	int id;
	String title;
	String year;
	String rating;
	String genre;
	
	public Movie()
	{
		
	}
	
	public Movie(int id, String title, String year,	String rating, String genre)
	{
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.genre = genre;
	}
	
	public String displaySummary()
	{
		return title + " (" + rating + ") was released in " + year + ". Genre(s): " + genre;
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
	public String getGenre() 
	{
		return genre;
	}
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
