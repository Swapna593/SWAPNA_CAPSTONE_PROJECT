package jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepare_stmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Swapna@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
//		System.out.println("Connection created");
		String qry="insert into students(rollno,name,per) values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(qry);
		for(int i=1;i<=2;i++) {
			System.out.println("rollno:");
			int roll=sc.nextInt();
			System.out.println("name:");
			String name=sc.next();
			System.out.println("per:");
			int per=sc.nextInt();
			
			pst.setInt(1,roll);
			pst.setString(2, name);
			pst.setInt(3,per);
			System.out.println(i+"row inserted");
			pst.executeUpdate();
		}
		
        pst.close();
        con.close();
	}

}
