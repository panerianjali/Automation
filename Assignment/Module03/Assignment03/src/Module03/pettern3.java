package Module03;

public class pettern3 {
	public static void main(String[] args) {
		
		int i, j, n = 5;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();

	}
	}
}
