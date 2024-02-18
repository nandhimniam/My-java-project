package jdbc1step;
import java.sql.*;

public class delete {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		String qry="delete from customer.customer where cus_name='joe' ";
		String qry1="delete from admin.admin where staff_id=138 ";
		String qry2="delete from product.product where quantity=3 ";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/customer","root","root");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/admin","root","root");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/product","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement(); 
		    stmt.executeUpdate(qry);
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
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


