package jdbc_con;

import java.sql.*;

public class FetchStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        String sql = "SELECT * FROM student";
        try (Connection c = DriverManager.getConnection(url, user, pass);
             Statement s = c.createStatement();
             ResultSet r = s.executeQuery(sql)) {
            while (r.next())
                System.out.println(r.getInt(1) + " " + r.getString(2) );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
