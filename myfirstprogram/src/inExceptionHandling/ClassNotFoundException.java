package inExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassNotFoundException {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//step1:loading driver class by using class.forName class
		System.out.println("Main method started!!!!");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch66","root","root");
		Statement stmt=con.createStatement();
		String sql="select * from student ";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));


		}
	}

}
