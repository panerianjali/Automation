package Module03;
//remaining
public class Petter4 {
	public static void main(String[] args) {
		
		int i, j , n=5;
        int num = 1;
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

			}
	}

}
