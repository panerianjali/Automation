package Module03;

import java.util.Scanner;

public class MarksGrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage marks");
		double per = sc.nextDouble();
		
		if(per >= 90) {
			System.out.println("Excellent: GRADE AA");
			
		}
		else if(per < 90 && per >= 81){
			System.out.println("Very good: GRADE AB");
			
		}
		else if(per < 81 && per>= 71) {
			System.out.println("Good : GRADE BB");
		}
		else if(per < 71 && per >= 61) {
			System.out.println("Satisfied : BC");
		}
		else if(per< 61 && per >=51) {
			System.out.println("CD");
		}
		else if(per <51 && per >= 41) {
			System.out.println("DD");
			
		}else  {
			System.out.println("Fail");
		}
		
		
	}

}
