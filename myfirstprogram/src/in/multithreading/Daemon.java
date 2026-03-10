package in.multithreading;

public class Daemon extends Thread{
	@Override
public void run() {
	System.out.println("Run method");
	for (int i=0;i<10;i++) {
		System.out.println("Run: "+i);
	}
	Thread.currentThread().setPriority(MAX_PRIORITY);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Daemon d =new Daemon();
		d.start();
		System.out.println(Thread.currentThread());
		for (int i=0;i<10;i++) {
			System.out.println("Main: "+i);
		}
		System.out.println("Main method ended");

	}

}
