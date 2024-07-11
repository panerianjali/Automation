package Module03;

import java.util.Scanner;

public class MinMaxValueArray {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int element = sc.nextInt();
		
		int [] arr = new int[element]; 
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<element; i++) {
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print("The maximum number is"+max);
		System.out.println();
		System.out.print("The minimum number is"+min);
	}

}
