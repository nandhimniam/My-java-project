import java.sql.*;
public class preparedstmt {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps =null;
		String qry=("insert into student values(?,?,?,?,? )");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/student","root","root");
			System.out.println("Connection Established");
		    ps=(con).prepareStatement(qry);
		    
		    
			System.out.println("Table or platform created");
			
			ps.setInt(1,100);
			ps.setString(2,"Alex");
			ps.setString(3,"Six");
			ps.setString(4,"IT");
			ps.setLong(5,98653317);
			ps.executeUpdate();
			
			ps.setInt(1,200);
			ps.setString(2,"Ben");
			ps.setString(3,"Two");
			ps.setString(4,"IT");
			ps.setLong(5,98655517);
			ps.executeUpdate();
			
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
		if(con!=null)
			try {
				con.close();
				System.out.println("Connection closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		

	}

}



	


