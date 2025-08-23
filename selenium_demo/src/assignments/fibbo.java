package assignments;
public class fibbo {
	public static void main(String[] args) {
		int a1=0;
		int a2=1;
		int sum=0;
		int n=10;
		int i=1;
		while(i<=n) {
			System.out.print(a1+" ");
			sum=a1+a2;
			a1=a2;
			a2=sum;
			i++;
		}
	}
}
