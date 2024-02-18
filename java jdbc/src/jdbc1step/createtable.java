package jdbc1step;
import java.sql.*;

public class createtable {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/customer","root","root");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/admin","root","root");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/product","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement();
			stmt.execute("create table customer.customer(cus_no int,cus_name varchar(20),order_id int,order_date int,product_id int)");
			stmt.execute("create table admin.admin(manager_id int,staff_id int,staff_name varchar(20),cus_id int,product_id int)");
			stmt.execute("create table product.product(product_id int,product_name varchar(20),order_id int,quantity int,sale_price int)");
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

		


