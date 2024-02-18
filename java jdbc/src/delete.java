import java.sql.*;

public class delete {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		String qry="delete from student where name='Jhon' ";
		String qry1="delete from student where id=101 ";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/student","root","root");
			
			System.out.println("Connection Established");
		    stmt=con.createStatement(); 
		    stmt.executeUpdate(qry);
			stmt.executeUpdate(qry1);
			
			System.out.println("Data deleted");
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



