import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;
public class Inserttable {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		String qry=("insert into student values(101,'Riya','four','IT','986533181' )");
		String qry1=("insert into student values(102,'Adam','five','CSE','986633182')");
		String qry2=("insert into student values(103,'Rithick','four','IT','987533183')");
		String qry3=("insert into student values(104,'Jhon','five','CSE','686533184')");
		String qry4=("insert into student values(105,'Joe','four','IT','786533185')");
		String qry5=("insert into student values(106,'Sandy','five','CSE','886533186')"); 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/student","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement(); 
			stmt.execute(qry);
			stmt.execute(qry1);
			stmt.execute(qry2);
			stmt.execute(qry3);
			stmt.execute(qry4);
			stmt.execute(qry5);
			
			System.out.println("Data Inserted into table");
		}
		catch(ClassNotFoundException | SQLException e) {
			(e).printStackTrace();
			
		}
		if(stmt!=null)
			try {
				stmt.close();
				System.out.println("Statement closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		if(con!=null)
			try {
				con.close();
				System.out.println("Connection closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		

	}

}

