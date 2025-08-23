package jdbc_Mini_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Student {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="Swapna@123";
		
		String sql="create table student(rollno int,"
				+"name varchar(50),"
				+"per int,"
				+"email varchar(50),"
				+"city varchar(50))";
		String insertSql="insert into student values(101,'Spandana',80,'abc@gmail.com','kdp'),"
				+"(102,'Swapna',85,'def@gmail.com','kdp'),"
				+"(103,'Jyoshna',90,'ghi@gmail.com','kdp')";
		
		String updateSql="update student set per=95 where name='Spandana'";
		
		String highest_per_qry="select * from students where per=(select max(per) from student)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Student table created.");
			
			//insert records
			stmt.executeUpdate(insertSql);
			System.out.println("Inserted records");
			
			
			
			ResultSet rs=stmt.executeQuery("select * from student ");
			System.out.println("Roll\tName\tPercentage\tEmail\tCity");
			while(rs.next()) {
				int roll=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				String city=rs.getString("city");
				System.out.println(roll+" "+name+" "+per+"  "+email+" "+city);
			}
			
			//update record
			stmt.executeUpdate(updateSql);
			System.out.println("Updated record");
			
			rs=stmt.executeQuery("select * from student ");
			System.out.println("Roll\tName\tPercentage\tEmail\tCity");
			while(rs.next()) {
				int roll=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				String city=rs.getString("city");
				System.out.println(roll+" "+name+" "+per+"  "+email+" "+city);
			}
			
			//find highest percentage student
			rs=stmt.executeQuery(highest_per_qry);
			System.out.println("Highest percentage student: ");
			while(rs.next()) {
				String name=rs.getString("name");
				int per=rs.getInt("per");
				System.out.println(name+"  "+per);
			}
			System.out.println("------------------------------");
			//Arrange records in ascending order 
			System.out.println("Arranging records in ascending order ");
			rs=stmt.executeQuery("select * from student order by per asc");
			while(rs.next()) {
				String name=rs.getString("name");
				int per=rs.getInt("per");
				System.out.println(name+"  "+per);
			}
			
			System.out.println("------------------------------");
			//Find all the student which belong to same city 
			System.out.println("same city students: ");
			rs=stmt.executeQuery("select * from student where city in(select city from student group by city)");
			while(rs.next()) {
				int roll=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				String city=rs.getString("city");
				System.out.println(roll+" "+name+" "+per+"  "+email+" "+city);
			}
			
			System.out.println("------------------------------");
    		//Add new column
			stmt.executeUpdate("alter table student add contact varchar(20)");
			System.out.println("Added column contact to student table");
			
     		System.out.println("------------------------------");
			//Modify column datatype 
			stmt.executeUpdate("alter table student modify contact bigint");
			System.out.println("Modified contact colunm  datatype");
			
			System.out.println("------------------------------");
			//Change the name of table 
			stmt.executeUpdate("rename table student to studentdetails");
			System.out.println("Renamed table student to studentdetails");
			
			System.out.println("------------------------------");
			//Delete column 
			stmt.executeUpdate("alter table studentdetails drop column contact");
			System.out.println("deleted contact column");
			
			System.out.println("------------------------------");
			//Delete single row
			stmt.executeUpdate("delete from studentdetails where rollno=103");
			System.out.println("deleted 1 row");
			
			System.out.println("-------------------------------");
			//Delete all the records from table without affecting table attributes
			stmt.executeUpdate("truncate table studentdetails");
			System.out.println("deleted all records ");
			
			System.out.println("-------------------------------");
			//Delete entire table 
			stmt.executeUpdate("drop table studentdetails");
			System.out.println("Dropped studentdetails table");
			
			System.out.println("-------------------------------");
			//Join two tables student and an institute and print only common record from both the table 
			stmt.executeUpdate("create table if not exists student(rollno int primary key,name varchar(20))");
			stmt.executeUpdate("create table if not exists institute(rollno int primary key,course varchar(20))");
			stmt.executeUpdate("insert into student values(101,'Person1'),(102,'Person2')");
			stmt.executeUpdate("insert into institute values(101,'course1'),(103,'course2')");
			
			System.out.println("student table :");
			rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name"));
			}
			
			System.out.println("institute table :");
			rs=stmt.executeQuery("select * from institute");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("course"));
			}
			
			System.out.println("Inner join");
			rs=stmt.executeQuery("select * from student inner join institute where student.rollno=institute.rollno");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("course"));
			}
			
			System.out.println("---------------------------------");
			//Join two tables student and an institute and print only left side table record 
			System.out.println("Left join");
			rs=stmt.executeQuery("select * from student left join institute on student.rollno=institute.rollno");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("course"));
			}
			
			//Join two tables student and an institute and print only right side table record 
			System.out.println("---------------------------------");
			System.out.println("Right join");
			rs=stmt.executeQuery("select * from student right join institute on student.rollno=institute.rollno");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("course"));
			}
			
			//Join two tables student and an institute and print all the records from both the tables 
			System.out.println("---------------------------------");
			System.out.println("Full join");
			rs=stmt.executeQuery("select * from student left join institute on student.rollno=institute.rollno"
					+" union "
					+"select * from student right join institute on student.rollno=institute.rollno");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("course"));
			}
			
			
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}

}
