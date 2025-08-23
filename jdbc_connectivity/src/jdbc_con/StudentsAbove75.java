package jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentsAbove75 {
	public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/mydb", "root", "Swapna@123");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, name, marks FROM students where marks>=90");
        while (rs.next())
            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("marks"));
        conn.close();
    }
}
