package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB implements DAO<Movie> 
{

	// pg. 677
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String password = "sesame";
		
		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;
	}
	
	
	@Override
	public Movie get(int id) 
	{
		Movie a = null;
		String sql = "select * from movie where id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql))
		{
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				a = getMovieFromResultSet(rs);
		}
		catch (SQLException e)
		{
			System.out.println("whoops");
		}
		
		return a;
	}

	@Override
	public List<Movie> getAll() 
	{
		List<Movie> movies = new ArrayList<Movie>();
		// pg. 679
			
		String sql = "select * from movie;";

		try (Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery())
		{
			
			
			// pg. 681
			while (rs.next())
			{
				Movie a = getMovieFromResultSet(rs);
				movies.add(a);
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Error getting all movies!");
			e.printStackTrace();
			movies = null;
		}
		
		return movies;
	}

	@Override
	public boolean add(Movie a) 
	{
		boolean success = false;
		String sql = "insert into movie (title, year, rating, director) values (?, ?, ?, ?)";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql))
		{
			ps.setString(1, a.getTitle());
			ps.setString(2, a.getYear());
			ps.setString(3, a.getRating());
			ps.setString(4, a.getDirector());
			ps.executeUpdate();
			success = true;
		}
		catch (SQLException e)
		{
			System.out.println("Error adding Movie");
			e.printStackTrace();
		}
		
		return success;
	}

	@Override
	public boolean update(Movie a) 
	{
		boolean success = false;
		String sql = "update movie set" + 
					 " title = ?," + 
					 " year = ?," + 
					 " rating = ?," + 
					 " director = ?" + 
					 " where id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql))
		{
			ps.setString(1, a.getTitle());
			ps.setString(2, a.getYear());
			ps.setString(3, a.getRating());
			ps.setString(4, a.getDirector());
			ps.setInt(5, a.getId());

			ps.executeUpdate();
			success = true;
		}
		catch (SQLException e)
		{
			System.out.println("Error updating Movie");
			e.printStackTrace();
		}
		
		return success;
	};

	@Override
	public boolean delete(Movie a) 
	{
		boolean success = false;
		String sql = "delete from movie where id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql))
		{
			ps.setInt(1, a.getId());
			ps.executeUpdate();
			success = true;
		}
		catch (SQLException e)
		{
			System.out.println("Error deleting Movie");
			e.printStackTrace();
		}
		
		return success;
	}
	
	private Movie getMovieFromResultSet(ResultSet rs) throws SQLException
	{
		int id = rs.getInt(1);
		String t = rs.getString(2);
		String y = rs.getString(3);
		String r = rs.getString(4);
		String d = rs.getString(5);
		Movie a = new Movie(id, t, y, r, d);
		return a;
	}

	
	
}
