package jdbc_con;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*Create procedure or functions for employee table
Add 5000 bonus to all employee
Print same name employees
Print highest and lowest salary from employee table
*/
 
public class Callable_Employee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb";
	    String user = "root";
	    String password = "Swapna@123";
	    try (Connection con = DriverManager.getConnection(url, user, password)) {
	        
//	        CallableStatement cst = con.prepareCall("{CALL addBonus0()}");
//	        
//	        int n = cst.executeUpdate();
//	        System.out.println("Added bonus to "+n+" Employees");
//	        
	        CallableStatement cst2= con.prepareCall("{CALL sameNameEmployees0()}");
	        ResultSet rs=cst2.executeQuery();
	        while(rs.next()) {
	        	String name=rs.getString("name");
	        	int count=rs.getInt("num_of_employees");
	        	System.out.println("Name : "+name+" ,Count: "+count);
	        }
	        
	        CallableStatement cst3= con.prepareCall("{CALL getHighestAndLowestSalary00()}");
	        rs=cst3.executeQuery();
	        while(rs.next()) {
	        	int high=rs.getInt("Highsal");
	        	int low=rs.getInt("Minsal");
	        	System.out.println("Highest sal: "+high+" ,Lowest salt: "+low);
	        }
	 	    
	     }    
	    catch (SQLException e) {
                e.printStackTrace();
       }
   }
}
