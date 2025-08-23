package file_handling;

import java.io.Serializable;

public class Student implements Serializable {
      int id;
      String name;
      Student(int id, String name){
    	  this.id=id;
    	  this.name=name;
      }
      void display() {
    	  System.out.println("Id : "+id+" Name : "+name);
      }

}
