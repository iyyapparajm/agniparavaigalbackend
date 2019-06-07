package com.projectZ.firstweb.repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class DBCreation {
	public String CreateDB(String DBName) {
	String url =  "jdbc:sqlite:bin/" + DBName;
	String status = "InUpDb Not created";
	try {
		Connection conn = DriverManager.getConnection(url);
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("Driver Name: "+meta.getDriverName());
		System.out.println("Your DB Created!!");
		status = "DbCreated";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		status = "InUpDb Not Created";
	}
	return status;
	}
}
