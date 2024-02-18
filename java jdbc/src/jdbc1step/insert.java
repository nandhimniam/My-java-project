package jdbc1step;
import java.sql.*;

public class insert {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		String qry=("insert into customer.customer values(101,'Riya',123,20/9/18,111 )");
		String qry1=("insert into customer.customer values(101,'Adam',123,20/9/18,111)");
		String qry2=("insert into customer.customer values(103,'Rithick',124,21/9/18,112)");
		String qry3=("insert into customer.customer values(103,'Jhon',124,21/9/18,112)");
		String qry4=("insert into customer.customer values(104,'Joe',125,22/9/18,113)");
		String qry5=("insert into admin.admin values(001,126,'Sandy',01,111)"); 
		String qry6=("insert into admin.admin values(001,126,'Sandy',01,111)"); 
		String qry7=("insert into admin.admin values(002,137,'Roshan',02,112)"); 
		String qry8=("insert into admin.admin values(002,137,'Roshan',02,112)"); 
		String qry9=("insert into admin.admin values(003,138,'Max',03,113)"); 
		String qry10=("insert into product.product values(111,'Rice',123,2,5000)"); 
		String qry11=("insert into product.product values(111,'Rice',123,2,5000)"); 
		String qry12=("insert into product.product values(112,'Wheat',124,1,2500)"); 
		String qry13=("insert into product.product values(112,'Wheat',124,1,2500)"); 
		String qry14=("insert into product.product values(113,'Maida',125,3,6500)"); 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/customer","root","root");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/admin","root","root");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/product","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement(); 
			stmt.execute(qry);
			stmt.execute(qry1);
			stmt.execute(qry2);
			stmt.execute(qry3);
			stmt.execute(qry4);
			stmt.execute(qry5);
			stmt.execute(qry6);
			stmt.execute(qry7);
			stmt.execute(qry8);
			stmt.execute(qry9);
			stmt.execute(qry10);
			stmt.execute(qry11);
			stmt.execute(qry12);
			stmt.execute(qry13);
			stmt.execute(qry14);
			
			
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


