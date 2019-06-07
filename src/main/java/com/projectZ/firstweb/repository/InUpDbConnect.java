package com.projectZ.firstweb.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class InUpDbConnect {
	
	public static void InUpDbConnection() {
		Connection conn = null;
		String url ="jdbc:sqlite:bin/InUp.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Connection to the SQLiteDB has been established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
