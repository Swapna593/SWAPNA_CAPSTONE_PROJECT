package jdbc_con;

import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        String insertSQL = "INSERT INTO students VALUES (?, ?, ?)";
        String updateSQL = "UPDATE students SET marks = ? WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
             PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {

            conn.setAutoCommit(false);

            insertStmt.setString(2, "John");
            insertStmt.setInt(1, 201);
            insertStmt.setInt(3, 85);
            insertStmt.executeUpdate();

            updateStmt.setInt(1, 90);
            updateStmt.setString(2, "Alice");
            updateStmt.executeUpdate();

            conn.commit();
            System.out.println("Transaction committed successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            try (Connection conn = DriverManager.getConnection(url, user, pass)) {
                conn.rollback();
                System.out.println("Transaction rolled back.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
