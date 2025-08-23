package jdbc_con;

import java.sql.*;

public class FetchStudentsById {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        String sql = "SELECT id, name, marks FROM students WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            int id = 101;
            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id")
                                     + ", Name: " + rs.getString("name")
                                     + ", Marks: " + rs.getInt("marks"));
                } else {
                    System.out.println("No student found with ID " + id);
                }
            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid ID format: must be an integer.");
        } catch (SQLException e) {
            System.err.println("Database error:");
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("ErrorCode: " + e.getErrorCode());
        }
    }
}
