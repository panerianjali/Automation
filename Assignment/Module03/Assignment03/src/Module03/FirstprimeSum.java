package Module03;

public class FirstprimeSum {
	public static void main(String[] args) 
	{
		int count, sum=0;
		for(int number =1; number <=100; number++)
		{
			count = 0;
			for(int i=2;i<=number/2;i++ ) {
				if(number%i==0) {
					count ++;
					break;
				}
			}
			if(count == 0 && number != 1) {
				sum = sum + number;
			}
		}
		System.out.println("The sum of prime number 1 to 1oo is" +sum);
	}

}
