package in.multithreading;

public class ImplementsRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsRunnable i1=new ImplementsRunnable();
		Thread i2=new Thread(i1);
		i2.start();
System.out.println("main method Started");
	for (int i=0;i<10;i++) {
		System.out.println("Main: "+i);
	}
	System.out.println("Main method ended");

	}

	@Override
	public void run() {
		System.out.println("Run Method Called");
		for(int i=0;i<=10;i++) {
			System.out.println("run: "+i);

		}
		System.out.println("Run Method Ended");

	}

}
