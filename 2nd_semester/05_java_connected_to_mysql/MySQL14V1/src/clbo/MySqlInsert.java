package clbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlInsert
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = null;
		PreparedStatement prepareStatement = null;

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
			prepareStatement = conn.prepareStatement("INSERT INTO customers VALUES(default, ?,?,?, ?)");
			prepareStatement.setString(1, "Suleman");
			prepareStatement.setString(2, "Lindgård");
			prepareStatement.setInt(3, 23232323);
			prepareStatement.setString(4, "sule@kea.dk");
			
			prepareStatement.executeUpdate();

		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
		finally
		{
			if (conn != null)
			{
				conn.close();
			}

		}
	}

}
