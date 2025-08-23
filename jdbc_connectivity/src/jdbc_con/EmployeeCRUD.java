package jdbc_con;

import java.sql.*;

public class EmployeeCRUD {
    public static void main(String[] args) throws SQLException {
    	String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String pass = "Swapna@123";
        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        int rows;
        rows = stmt.executeUpdate("INSERT INTO employee(id, name) VALUES(105, 'Alice')");
        System.out.println("Rows inserted = " + rows);
        rows = stmt.executeUpdate("UPDATE employee SET name = 'Prathap' WHERE id = 105");
        System.out.println("Rows updated = " + rows);
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
        while (rs.next())
            System.out.println(rs.getInt("id") + " " + rs.getString("name") );
        rows = stmt.executeUpdate("DELETE FROM employee WHERE name = 'Prathap'");
        System.out.println("Rows deleted = " + rows);
        conn.close();
    }
}
