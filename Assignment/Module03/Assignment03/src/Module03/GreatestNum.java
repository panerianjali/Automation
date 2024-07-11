package Module03;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) 
	{
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		num = sc.nextInt();
		
		if(num>=0)
		{
			System.out.println("The number is greater" +num);
		}
		else {
			System.out.println("The number is smaller");
		}
		
	}
}
