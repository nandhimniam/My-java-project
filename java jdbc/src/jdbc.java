
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;

public class jdbc {
	public static void main(String[]args) {
		Connection con=null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			 con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/Firstjdbc","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement();
			stmt.execute("create table Firstjdbc(name varchar(20),id int,salary double)");
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


