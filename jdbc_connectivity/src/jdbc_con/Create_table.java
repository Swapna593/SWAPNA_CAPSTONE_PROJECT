package jdbc_con;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create_table {

	public static void main(String[] args){
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Swapna@123";
		
		String sql="create table if not exists students(rollno int,"
				+"name varchar(50),"
				+"per int,"
				+"email varchar(50))";
		String insertSQL="insert into students values(101,'Swapna',98,'abc@gmail.com'),"
				+"(102,'Spandana',99,'def@gmail.com'),"
				+"(103,'Jyoshna',99,'ghi@gmail.com')";
		String updateSQL="update students set per=95 where rollno=101";
		try {
			//load driver
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   //connection
		   Connection con=DriverManager.getConnection(url,user,password);
		   System.out.println("Connection created");
		   
		   //create stmt
		   Statement stmt=con.createStatement();
		   
		   //call create qry using stmt
		   stmt.executeUpdate(sql);
		   System.out.println("Students table created");
		   
		   //call insert qry using stmt
		   int rowInserted=stmt.executeUpdate(insertSQL);
		   if(rowInserted>0) {
			   System.out.println("new student record inserted");
		   }
		   //update using stmt
		   stmt.executeUpdate(updateSQL);
		   
		   //print table
		   ResultSet rs=stmt.executeQuery("select * from students");
			System.out.println("ROLL\tNAME\tPERCENTAGE\tEMAIL");
			
		   //while loop for all the table records
			while(rs.next()) {
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				System.out.println(rollno+" "+name+" "+per+" "+email);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

}
