import java.sql.DriverManager;
import java.sql.*;
public class createtable {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			 con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/Student","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement();
			stmt.execute("create table Student(id int,name varchar(20),class varchar(15),course varchar(15),mobilenumber varchar(20))");
			System.out.println("Table or platform created");
		}
		catch(ClassNotFoundException | SQLException e) {
			(e).printStackTrace();
			
		}
		if(stmt!=null)
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		if(con!=null)
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		

	}
}
