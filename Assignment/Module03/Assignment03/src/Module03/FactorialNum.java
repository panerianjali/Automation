package Module03;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		int num;
		long factl= 1;
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any number");
		 num = sc.nextInt();
		 
		 for(int i=1; i<=num;i++) {
			 factl = factl * i;
		 }
		 System.out.println("Factorial of" +num+ "is" +factl);
		 
	}

}
