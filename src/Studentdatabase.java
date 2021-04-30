import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import  java.sql.Connection;	


public class Studentdatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String dburl = "jdbc:mysql://localhost:3306/aneeshia";
		String user= "root";
		String pwd ="";
		String query = "SELECT * FROM `student` ";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection(dburl, user, pwd);
		Statement stmt = con.createStatement();	
		ResultSet rs= stmt.executeQuery(query);		
		while (rs.next()){
    		String id = rs.getString(1);
    		String Name = rs.getString(2);
    		String Marks = rs.getString(3);
            String Age = rs.getString(4);					                               
            System. out.println("Student ID:" +id+ " Name: " +Name+ "  Marks: "+Marks+"  Age:  "+Age);
		}
		
		con.close();	

	}

}
