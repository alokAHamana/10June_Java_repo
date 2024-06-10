package com.ag.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
	
	public static void main(String[] args) {
		try {
			// step1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookstore", "root",
					"alok123123");

                 System.out.println("connection bild success");

			
			//Now Show the Content of table of database -Bookstore
			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from book");

			while (rs.next()) {    // this is used for print value of table writen above
		System.out.println(rs.getInt(1) + " ||bookname - " + rs.getString(2) + "  ||author - " + rs.getString(3)  + " ||price -" + rs.getInt(4));
			}

	
		} catch (Exception e) {
			System.out.println(e);

}}
}

