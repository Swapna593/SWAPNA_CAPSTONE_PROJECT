package jdbc_con;
import java.sql.*;
public class LoginConsole {
    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/mydb";
        String dbUser = "root";
        String dbPass = "Swapna@123";
        String sql = "SELECT * FROM users WHERE name = ? AND Location = ?";
        try (Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "Swapna");
            pstmt.setString(2, "kmp");
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Login successful. Welcome, " + "Swapna" + "!");
                } else {
                    System.out.println("Login failed: invalid username or password.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error:");
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("ErrorCode: " + e.getErrorCode());
        }
    }
}
