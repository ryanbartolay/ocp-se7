package com.ryan.runtime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	static String[] columns;
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/realestate";
		Connection connection = DriverManager.getConnection(url, "root", "");
		
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_READ_ONLY);
		
		String sql = "select * from tbl_menu";
		
		ResultSet rs = statement.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		columns = new String[rsmd.getColumnCount()];
		
		for(int i = 0; i < rsmd.getColumnCount(); i++) {
			columns[i] = rsmd.getColumnName(i + 1);
		}
		
		//rs.absolute(-2);
		//rs.relative(3);
		rs.relative(-200);
		rs.relative(1);
		
		printOut(rs);
		
//		while(rs.next()) {
//			
//			for(int i = 0; i < columns.length; i++) {
//				try {
//					System.out.println(columns[i] + "\t " + rs.getObject(columns[i]));	
//				} catch(Exception e) {
//				}
//			}
//			System.err.println("--------------------------------");
//		}
	}
	
	private static void printOut(ResultSet rs) {
		for(int i = 0; i < columns.length; i++) {
			try {
				System.out.println(columns[i] + "\t " + rs.getObject(columns[i]));	
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
