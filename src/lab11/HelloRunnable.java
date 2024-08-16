package lab11;

public class HelloRunnable implements Runnable {
	@Override
	public void run() {
		long threadID = Thread.currentThread().getId();
		System.out.println("Hello from thread " + threadID);
	}

	public static void main(String[] args) {
		System.out.println("Start main");
		int MAX_THREAD = 4;
		for (int i = 0; i < MAX_THREAD; i++) {
			(new Thread(new HelloRunnable())).start();
		}
		System.out.println("End main");
	}
}
