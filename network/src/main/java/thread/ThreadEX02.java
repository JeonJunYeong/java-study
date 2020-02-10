package thread;

public class ThreadEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1=new DigitalThread();
		Thread thread2=new AlphabetThread();
		Thread thread3=new DigitalThread();
		
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
