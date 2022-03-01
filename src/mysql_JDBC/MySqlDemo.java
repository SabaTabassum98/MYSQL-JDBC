package mysql_JDBC;
import java.sql.*;

public class MySqlDemo  {
	
  public static void main(String[] args) throws Exception {
	  // load the drivers
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  //establish connection between java application with sql database
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saba","root", "9908401215");
  
	  //create statement object
	  Statement st = con.createStatement();
  
	  //write and execute query
	  
	  String query="create table employee(EmpNo int(3) primary key,EmpName varchar(10), EmpSalary float(5))";
	  
	  String query1 = "insert into employee values(4,'wahab',200000)";
	  
	  //String query2 = "insert into employee values(1,'neil',20000)";
	  
	  st.executeUpdate(query1);
	  
	 // System.out.println("Employee Table created successfully");
	  System.out.println("Row inserted successfully");

	  //connection close
	  st.close();
		con.close();
  }
}
