package jdbc1step;
import java.sql.*;

public class update {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		String qry="update customer.customer set cus_name='Draco' where product_id=111 ";
		String qry1="update customer.customer set order_date=23/9/18 where cus_no=103 ";
		String qry2="update admin.admin set staff_name='Rose' where manager_id=002 ";
		String qry3="update admin.admin set product_id=183 where staff_id=001 ";
		String qry4="update product.product set product_name='Cashew' where quantity=1 ";
		String qry5="update product.product set sale_price=6000 where product_id=111 ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/student","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement(); 
		    stmt.executeUpdate(qry);
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
			stmt.executeUpdate(qry4);
			stmt.executeUpdate(qry5);
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


