package jdbc_con;

import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        String sql = "UPDATE students SET name = ?, marks = ? WHERE id = ?";
        try (Connection c = DriverManager.getConnection(url, user, pass);
             PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, "Person1");
            p.setInt(2, 98);
            p.setInt(3, 104);
            int rows = p.executeUpdate();
            System.out.println(rows > 0 ? "Updated successfully" : "No matching student found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
