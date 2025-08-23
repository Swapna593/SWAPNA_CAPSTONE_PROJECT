package array_prac;

public class twoD_arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr=new int[4][4];//static array
        int num=1;
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		arr[i][j]=num+1;
        		num++;
        	}
        	System.out.println(" ");
        }
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+"\t ");
        	}
        	System.out.println(" ");
        }
        
	}

}
