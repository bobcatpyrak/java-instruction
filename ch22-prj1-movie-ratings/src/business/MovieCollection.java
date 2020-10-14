package business;

import java.util.*;
import java.util.function.Predicate;

public class MovieCollection 
{
	private List<Movie> movies = new ArrayList<>();
	
	public MovieCollection()
	{
		
	}
	
	public MovieCollection(List<Movie> list)
	{
		movies = list;
	}
	
	public void add(Movie m)
	{
		movies.add(m);
	}
	
	public List<Movie> filterMovies(Predicate<Movie> condition)
	{
		List<Movie> filteredMovies = new ArrayList<>();
		for (Movie m : movies)
			if(condition.test(m))
				filteredMovies.add(m);
		return filteredMovies;
	}
	
	public double getLowestRating()
	{
		double lowest = movies.stream()
				.map(m -> m.getRating())
				.reduce(5.0, Math::min);
		
		return lowest;
	}
	
	public double getHighestRating()
	{
		double highest = movies.stream()
				.map(m -> m.getRating())
				.reduce(0.0, Math::max);
		
		return highest;		
	}

	public double getAverageRating()
	{
		double average = movies.stream()
				.map(m -> m.getRating())
				.reduce(0.0, (m1, m2) -> m1+m2);
		
		average /= movies.size();
		
		return average;		
	}
	
	public int getSize()
	{
		return movies.size();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
}
