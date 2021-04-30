import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dburl = "jdbc:mysql://localhost:3306/aneeshia";
		String user= "root";
		String pwd ="";
		Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection(dburl, user, pwd);
		String query = "INSERT INTO student(student_id,Student_name,Marks,Age) VALUES (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, "4");
		pstmt.setString(2, "Akku");
		pstmt.setString(3, "46");
		pstmt.setString(4, "24");
		pstmt.execute();
		
		String query1 = "SELECT * FROM `student` ";
		Class.forName("com.mysql.jdbc.Driver");	
		Statement stmt = con.createStatement();	
		ResultSet rs= stmt.executeQuery(query1);		
		while (rs.next()){
    		String id = rs.getString(1);
    		String Name = rs.getString(2);
    		String Marks = rs.getString(3);
            String Age = rs.getString(4);					                               
            System. out.println("Student ID:" +id+ " Name: " +Name+ "  Marks: "+Marks+"  Age:  "+Age);
		}

	}

}
