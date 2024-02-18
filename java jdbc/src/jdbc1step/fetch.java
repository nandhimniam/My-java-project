package jdbc1step;
import java.sql.*;

public class fetch {

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
			
		    ResultSet rs= stmt.executeQuery ("select * from customer.customer");
		    
		    
		    while(rs.next()) {
		    	int cus_no=rs.getInt(1);
		    	String cus_name=rs.getString(2);
		    	int order_id=rs.getInt(3);
		    	int order_date=rs.getInt(4);
		    	int product_id=rs.getInt(5);
		    	
		    	System.out.println(cus_no);
		    	System.out.println(cus_name);
		    	System.out.println(order_id);
		    	System.out.println(order_date);
		    	System.out.println(product_id);
		    	
		    }
		    rs.close();
		 
		    ResultSet rs1= stmt.executeQuery ("select * from admin.admin");
		    while(rs1.next()) {
		    	int manager_id=rs1.getInt(1);
		    	int staff_id=rs1.getInt(2);
		    	String staff_name=rs1.getString(3);
		    	int cus_id=rs1.getInt(4);
		    	int product_id=rs1.getInt(5);
		    	
		    	System.out.println(manager_id);
		    	System.out.println(staff_id);
		    	System.out.println(staff_name);
		    	System.out.println(cus_id);
		    	System.out.println(product_id);
		    	
		    }
		    rs1.close();
		  
		    ResultSet rs2= stmt.executeQuery ("select * from product.product");
		    while(rs2.next()) {
		    	int product_id=rs2.getInt(1);
		    	String product_name=rs2.getString(2);
		    	int order_id=rs2.getInt(3);
		    	int quantity=rs2.getInt(4);
		    	int sale_price=rs2.getInt(5);
		    	
		    	System.out.println(product_id);
		    	System.out.println(product_name);
		    	System.out.println(order_id);
		    	System.out.println(quantity);
		    	System.out.println(sale_price);
		    	
		    }
		    rs2.close();
			
			
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
