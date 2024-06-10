package com.ag.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConn {

	public static void main(String[] args) {
		try {
			// step1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/corejava2023db", "root",
					"alok123123");

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {    // this is used for print value of table writen above
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
