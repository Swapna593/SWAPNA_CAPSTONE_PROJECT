package day3_assignment;

public class even_odd_array {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int even_c=0;
		int odd_c=0;
		for(int b:arr) {
			if(b%2==0) {
				even_c++;
			}
			else {
				odd_c++;
			}
		}
		System.out.println("even count: "+even_c);
		System.out.println("odd count: "+odd_c);

	}

}
