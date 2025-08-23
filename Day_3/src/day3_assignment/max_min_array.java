package day3_assignment;

public class max_min_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,6,4};
		int max=arr[0];
		int min=arr[0];
		for(int a:arr) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println("Maximum ele: "+max);
		for(int b:arr) {
			if(b<min) {
				min=b;
			}
		}
		System.out.println("Minimum ele: "+min);
		

	}

}
