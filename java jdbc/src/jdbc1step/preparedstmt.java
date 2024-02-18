package jdbc1step;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;
public class preparedstmt {

	public static void main(String[] args) {
		Connection con1=null;
		Connection con2=null;
		Connection con3=null;
		PreparedStatement ps =null;
		PreparedStatement ps1 =null;
		PreparedStatement ps2 =null;
		String qry=("insert into customer.customer values(?,?,?,?,? )");
		String qry1=("insert into admin.admin values(?,?,?,?,? )");
		String qry2=("insert into product.product values(?,?,?,?,? )");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con1 =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/customer","root","root");
			con2 =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/admin","root","root");
			con3 =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/product","root","root");
			System.out.println("Connection Established");
		    ps=(con1).prepareStatement(qry);
		    ps1=(con2).prepareStatement(qry1);
		    ps2=(con3).prepareStatement(qry2);
		    
		    
			System.out.println("Table or platform created");
			
			ps.setInt(1,105);
			ps.setString(2,"Divya");
			ps.setInt(3,158);
			ps.setInt(4,22/6/19);
			ps.setInt(5,116);
			ps.executeUpdate();
			
			ps1.setInt(1,118);
			ps1.setInt(2,159);
			ps1.setString(3,"Eva");
			ps1.setInt(4,05);
			ps1.setInt(5,119);
			ps1.executeUpdate();
			
			ps2.setInt(1,118);
			ps2.setString(2,"Cereal");
			ps2.setInt(3,138);
			ps2.setInt(4,4);
			ps2.setInt(5,7000);
			ps2.executeUpdate();
			
			System.out.println("data inserted into table");
			
		}
		catch(ClassNotFoundException | SQLException e) {
			(e).printStackTrace();
			
		}
		if(ps!=null)
			try {
				ps.close();
				System.out.println("PrepredStatement closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		if(ps1!=null)
			try {
				ps1.close();
				System.out.println("PrepredStatement closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		if(ps2!=null)
			try {
				ps2.close();
				System.out.println("PrepredStatement closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		 if (con1 != null || con2 != null || con3 != null) {
             try {
                 if (con1 != null) con1.close();
                 if (con2 != null) con2.close();
                 if (con3 != null) con3.close();
                 System.out.println("Connections closed");
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }
     }
 
		
	}
 

		
           



