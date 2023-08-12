package com.employee;

import java.sql.*;

//for database connection
public class DBConnection {
	static Connection con;
	public static Connection createDBConnection() {
		try {
			//for loading the driver
//			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="KKSswetha@2003";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
}
