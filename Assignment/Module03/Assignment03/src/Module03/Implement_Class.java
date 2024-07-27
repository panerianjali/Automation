package Module03;



public class Implement_Class implements Runnable{
	
	public void run() {
		System.out.println("This code is running");
		
	}
	public static void main(String[] args) {
		
		Implement_Class cs = new Implement_Class();
		Thread t1 = new Thread(cs);
		t1.start();
		System.out.println("HI");
	}
	
	

}
