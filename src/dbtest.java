import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbtest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dburl = "jdbc:mysql://localhost:3306/aneeshia";
		  String user= "root";
		  String pwd ="";
		  Connection con = DriverManager.getConnection(dburl, user, pwd);
		  Class.forName("com.mysql.jdbc.Driver");	
		  
		  String query = "SELECT message_displayed FROM `login` WHERE username='fdgghgfhgf' AND password='dfgdfg' ";
		  Statement stmt = con.createStatement();	
		  ResultSet rs= stmt.executeQuery(query);
		  while (rs.next()){
			  String dbmessage = rs.getString(1);
			  System.out.println(dbmessage);
		  }
		  
		  
		 

	}

}
