package Module03;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5]=30/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBounds");
		}
		catch(Exception e) {
			System.out.println("Parent exception occurs");
		}
		System.out.println("rest of code ");
	}

}
