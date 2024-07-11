package Module03;

public class MyRunnable implements Runnable {
	
	public void run() {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
	}

	
}
