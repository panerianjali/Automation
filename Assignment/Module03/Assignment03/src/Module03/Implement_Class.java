package Module03;



public class Implement_Class {
	public void Run() {
		System.out.println("Thread Ended");
	}
	public static void main(String[] args) {
		
		Implement_Class cs = new Implement_Class();
		Thread t1 = new Thread();
		t1.start();
		System.out.println("HI");
	}
	

}
