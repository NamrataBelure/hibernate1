package com.jdbc.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
	public static void main(String[] args) {
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
	    
	    try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
			System.out.println("Connection SuccessFully....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
