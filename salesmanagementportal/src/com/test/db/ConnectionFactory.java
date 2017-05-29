package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public static Connection getConnection()
	{
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/test","root","root");  
			System.out.println("DB Connection established successfully");
			return con;
		}
		catch(Exception e){
			System.out.println(e);
			return con;
		}  
		
	}
	
	public static void main(String[] args) {
		getConnection();
	}

}
