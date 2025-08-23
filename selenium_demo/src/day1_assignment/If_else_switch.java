package day1_assignment;

public class If_else_switch {

	public static void main(String[] args) {
		 int year=2020;
	        int flag=0;
	        if((year%4==0 && year%100!=0) || year%400==0) {
	        	flag=1;
	        }
	        else {
	        	flag=0;
	        }
	        switch(flag) {
	        case 1:
	        	System.out.println("Leap");
	        	break;
	        case 0:
	        	System.out.println(" Not Leap");
	        	break;
	        
	        }

	}

}
