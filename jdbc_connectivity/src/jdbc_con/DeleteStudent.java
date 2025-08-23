package jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent {

	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3306/mydb";
	        String user = "root";
	        String pass = "Swapna@123";
	        String sql = "delete from students where id=104";
	        try (Connection c = DriverManager.getConnection(url, user, pass);
	             PreparedStatement p = c.prepareStatement(sql)) {
	            int rows = p.executeUpdate();
	            System.out.println(rows > 0 ? "Deleted successfully" : "No matching student found");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
