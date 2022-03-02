package mysql_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadEmpData {
	
	public static void main(String[] args) {
		try {
		// load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/saba";
		String name = "root";
		String password = "9908401215";
		//establish connection between java application with sql database
		Connection con = DriverManager.getConnection(url,name,password);
		 //create statement object
		Statement stmt = con.createStatement();
		
		//write and execute query
		String query = "select * from employee";
		//String query = "select * from employee where EmpName = 'Wahab'";
		ResultSet rs = stmt.executeQuery(query);
		
		// Using resultset to represents the result set of a database query
		// Printing data from resultset object "rs"
		while(rs.next()) {
			int empNo = rs.getInt("EmpNo");
			String empName = rs.getString("EmpName");
			String empSalary = rs.getString("EmpSalary");
			
			System.out.println(empNo + "  :  "+empName+"  :  "+empSalary);
		}
		//connection close
		stmt.close();
		con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
