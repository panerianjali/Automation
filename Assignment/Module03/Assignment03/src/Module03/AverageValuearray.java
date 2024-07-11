package Module03;

public class AverageValuearray {
	public static void main(String[] args) {
		int [] arr = new int [] {20,30,40,50,60,70,80};
		int sum = 0;
		for(int i =0; i < arr.length;i++) {
			sum = sum + arr[i];
			
		}
		double average = sum/ arr.length;
		System.out.println("Average value of array element is" + average);
		
	}

}
