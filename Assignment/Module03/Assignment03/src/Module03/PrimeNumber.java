package Module03;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num = sc.nextInt();
		if(isPrime(num)) 
		{
			System.out.println("This is a prime nuber"+num);
			
		}
		else {
			System.out.println("THis is not a prime number"+num);
		}
}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num <=1) {
		return false;
		}
		for(int i =2; i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
