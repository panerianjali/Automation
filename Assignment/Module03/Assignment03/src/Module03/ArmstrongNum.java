package Module03;

//In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:


public class ArmstrongNum {
	public static void main(String[] args) {
		int number = 371, originalnumber, reminder, result = 0;
		originalnumber = number;
		while(originalnumber != 0) {
			reminder = originalnumber % 10;
			result += Math.pow(reminder,3);
			originalnumber /= 10;
			
			
		}
		if(result == number)
			System.out.println("The number is armstrong"+number);
		else
			System.out.println("The number is not armstrong"+number);
		
	}

}
