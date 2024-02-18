import java.sql.*;
public class fetch {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded and Registered");
			 con =DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306/Student","root","root");
			System.out.println("Connection Established");
		    stmt=con.createStatement();
			
		    ResultSet rs= stmt.executeQuery ("select * from Student");
		    while(rs.next()) {
		    	int id=rs.getInt(1);
		    	String Name=rs.getString(2);
		    	String Class=rs.getString(3);
		    	String course=rs.getString(4);
		    	String mobilenumber=rs.getString(5);
		    	
		    	System.out.println(id);
		    	System.out.println(Name);
		    	System.out.println(Class);
		    	System.out.println(course);
		    	System.out.println(mobilenumber);
		    	
		    }
		    
			
			
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
