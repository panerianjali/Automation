package Module03;


class Test extends Thread{
	
	public void Run() {
		int i=0;
		while(i<4000) {
			System.out.println("My thread is running");
			System.out.println("hii");
			i++;
			
		}
	}
	
}

public class Mythread {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.start();
	}
}
