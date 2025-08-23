package array_prac;

public class sec_max {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,77,8,9,10};//dynamic array
		int first_max=arr[0];
		int sec_max=arr[1];
		for(int num:arr) {
			if(num>first_max) {
				sec_max=first_max;
				first_max=num;
			}
			else if(num>sec_max && num!=first_max) {
				sec_max=num;
			}
		}
		System.out.println(sec_max);
//		

	}

}
