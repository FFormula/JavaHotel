import java.util.ArrayList;
import java.sql.*;

public class Room 
{
	// laukai

	public Room (int id, String name, int beds)
	{
		//
	}
	
	public Room (String name, int beds)
	{
		//
	}
	
	@Override
	public String toString()
	{
		//
		return "";
	}
	
	public int getUsedBeds ()
	{
		//
		return 0;
	}
	
	public static ArrayList<Room> getList() 
	{
		ArrayList<Room> list = new ArrayList<>();
		//
		return list;
	}
	
	public static Room find (String name)
	{
		//
		return null;
	}
	
}
