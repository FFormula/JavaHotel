import java.sql.*;

public class DB 
{
	public final String CONNECTS = "jdbc:mysql://localhost/HOTEL";
	public final String USERNAME = "root";
	public final String PASSWORD = "root";
	
	private Connection connection;
	
	public Connection getConnection ()
	{
		return connection;
	}

	private DB ()
	{
		// код
	}

	// поле для singleton 

	// метод для singleton
}
