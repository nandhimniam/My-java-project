import java.sql.*;
public class update {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		String qry="update student set class='six' where course='CSE' ";
		String qry1="update student set id=108 where course='IT' ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/student","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement(); 
		    stmt.executeUpdate(qry);
			stmt.executeUpdate(qry1);
			System.out.println("Data updated");
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