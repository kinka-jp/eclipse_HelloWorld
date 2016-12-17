package web.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class websites {
	
	public static void main(String args[]) {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");      
	     
	     System.out.println("Success loading Mysql Driver!");
	    }
	    catch (Exception e) {
	      System.out.print("Error loading Mysql Driver!");
	      e.printStackTrace();
	    }
	    try {
	      Connection connect = (Connection) DriverManager.getConnection(
	          "jdbc:mysql://localhost:3306/java","java","pass");
	           

	      System.out.println("Success connect Mysql server!");
	      Statement stmt = (Statement) connect.createStatement();
	      ResultSet rs = stmt.executeQuery("select * from websites");
	                                                             
	while (rs.next()) {
	        System.out.println(rs.getString("name"));
	      }
	    }
	    catch (Exception e) {
	      System.out.print("get data error!");
	      e.printStackTrace();
	    }
	  }
}
