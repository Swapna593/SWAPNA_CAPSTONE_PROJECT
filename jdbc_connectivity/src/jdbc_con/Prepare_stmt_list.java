package jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Prepare_stmt_list {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Swapna@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		String qry="insert into student(rollno,name) values(?,?)";
		PreparedStatement pst=con.prepareStatement(qry);
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(103,"Swapna"));
		list.add(new Student(104, "Jyoshna"));
		for(Student s:list) {
			pst.setInt(1,s.rollno);
			pst.setString(2, s.name);
			pst.addBatch();
		}
		int n=pst.executeUpdate();
		System.out.println(n+" rows inserted");
		
	}

}
/*package JDBC_conn;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.*;
 
// 1. Student class (Java Bean)
class Student {
    int rollno;
    String name;
    int age;
 
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
 
public class prepare_stmt {
    public static void main(String[] args) {
        // 2. Database credentials
        String url = "jdbc:mysql://localhost:3306/mydb"; // Replace with your DB name
        String user = "root"; // Replace with your DB user
        String password = "root"; // Replace with your DB password
 
        // 3. List of students to insert
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Neeva Sharma", 20));
        students.add(new Student(102, "Reeva Sharma", 20));
        students.add(new Student(103, "Shiva Upadhyay", 20));
        students.add(new Student(104, "Amit Verma", 22));
        students.add(new Student(105, "Sonal Mehta", 19));
 
        // 4. JDBC code
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            // Insert records
            String insertQuery = "INSERT INTO students (rollno, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertPst = con.prepareStatement(insertQuery);
 
            for (Student s : students) {
                insertPst.setInt(1, s.rollno);
                insertPst.setString(2, s.name);
                insertPst.setInt(3, s.age);
                insertPst.addBatch(); // Adds this set of data to the batch
            }
 
            int[] result = insertPst.executeBatch(); // Executes all insertions
            System.out.println(result.length + " records inserted successfully.\n");
 
            // Fetch and print all records
            String selectQuery = "SELECT * FROM students";
            PreparedStatement selectPst = con.prepareStatement(selectQuery);
            ResultSet rs = selectPst.executeQuery();
 
            System.out.println("ID\tName\t\t\tMarks");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int age = rs.getInt("age");
 
                System.out.printf("%d\t%-20s\t%d\n", rollno, name, age);
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}*/
