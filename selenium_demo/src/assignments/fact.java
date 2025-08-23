package assignments;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++) {
        	fact=fact*i;
        }
        System.out.println("Fact of "+n+" is "+fact);
	}

}
