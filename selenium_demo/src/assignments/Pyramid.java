package assignments;
public class Pyramid {

	public static void main(String[] args) {
		int rows=5;
		for (int i = 0; i < rows; i++) {
            for (int sp = 0; sp < rows - i - 1; sp++) {
                System.out.print(" ");
            }
            for (int st = 0; st <= i; st++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
