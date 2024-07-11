package Module03;

public class Extending_thread extends Thread {
	
	    public void run() {
	        
	        System.out.println("Thread is running!");
	    }

	    public static void main(String[] args) {
	    	Extending_thread myThread = new Extending_thread();
	        myThread.start(); 
	    }

		
	}


