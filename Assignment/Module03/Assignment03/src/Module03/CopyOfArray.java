package Module03;

public class CopyOfArray {
	public static void main(String[] args) {
		int[] sourceArray = { 23, 43, 55 };
		int[] destinationArray = new int[3];
		System.arraycopy(sourceArray, 0, destinationArray, 0, 3);
		
	}
	
}
