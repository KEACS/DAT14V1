package clbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		ResultSet result = null;

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=");
			prepareStatement = conn.prepareStatement("SELECT * FROM customers");
			result = prepareStatement.executeQuery();
			// System.out.println("Connected to DB");

			while (result.next())
			{
				int id = result.getInt("id");
				String name = result.getString("name");
				String lastName = result.getString("last_name");
				String phone = result.getString("phone");
				String email = result.getString("email");

				System.out.println(id + ", " + name + ", " + lastName + ", " + phone + ", " + email);
			}

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
