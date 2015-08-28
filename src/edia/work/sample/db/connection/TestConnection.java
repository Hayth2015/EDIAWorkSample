package edia.work.sample.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestConnection {
	
	public static Connection conn;
	
	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(
					DbContract.HOST+DbContract.DB_NAME,
					DbContract.USERNAME,
					DbContract.PASSWORD);

			System.out.println("DB connected");
			
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}
	
}



