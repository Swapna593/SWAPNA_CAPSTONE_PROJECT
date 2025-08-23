package jdbc_con;

import java.sql.*;

public class FindStudentById {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        String sql = "SELECT * FROM students WHERE id=102";
        try (Connection c = DriverManager.getConnection(url, user, pass);
             PreparedStatement p = c.prepareStatement(sql)) {
           
            try (ResultSet r = p.executeQuery()) {
                if (r.next())
                    System.out.println(r.getInt("id") + " " + r.getString("name") );
                else
                    System.out.println("No student found with ID " + args[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
