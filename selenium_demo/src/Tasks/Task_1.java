package Tasks;
/* write a java program using if -else stmt that checks a person's eligibility for entry an
discount offers based on the following condition
1. the person must be 18 years or older and must have an id card to be allowed entry
2.the person gets a student discount if they are under 18 or if they are a student*/
public class Task_1 {

	public static void main(String[] args) {
        int age=17;
        boolean id=true;
        int entry_fee=500;
        int discount=100;
        if(age>=18 && id==true) {
        	System.out.println("Eligible to enter without discount");
        	System.out.println(entry_fee);
        }
        else {
        	System.out.println("Eligible for discount");
        	entry_fee=entry_fee-discount;
        	System.out.println(entry_fee);
        	
        }
	}

}
