package jdbc_con;

import java.sql.*;

public class CountRows {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/mydb", "root", "Swapna@123");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM employee");
        rs.next();
        System.out.println(rs.getInt(1));
        conn.close();
    }
}
