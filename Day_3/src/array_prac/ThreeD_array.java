package array_prac;

public class ThreeD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr=new int[2][3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					
					System.out.print(arr[i][j][k]+"  ");
				}
				System.out.println(" ");
			}
//			System.out.println(" ");
		}

	}

}
