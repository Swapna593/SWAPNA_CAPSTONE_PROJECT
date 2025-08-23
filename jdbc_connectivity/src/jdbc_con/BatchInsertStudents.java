package jdbc_con;

import java.sql.*;

public class BatchInsertStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        String sql = "INSERT INTO students  VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            conn.setAutoCommit(false);
            
            pstmt.setString(2, "Alice");
            pstmt.setInt(1, 20);
            pstmt.setInt(3, 88);
            pstmt.addBatch();
            
            pstmt.setString(2, "Bob");
            pstmt.setInt(1, 22);
            pstmt.setInt(3, 75);
            pstmt.addBatch();
            
            pstmt.setString(2, "Charlie");
            pstmt.setInt(1, 21);
            pstmt.setInt(3, 90);
            pstmt.addBatch();
            
            int[] updateCounts = pstmt.executeBatch();
            conn.commit();
            
            System.out.println("Inserted " + updateCounts.length + " records.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
