package in.multithreading;

public class Isdemon extends Thread{
	public void run() {
		for (int i=0;i<2;i++) {
			System.out.println("Child: "+i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Isdemon m= new Isdemon();
		m.setDaemon(true);//thread run in background
		m.start();
		System.out.println(m.isDaemon());
		for (int i=0;i<2;i++) {
			System.out.println("Main: "+i);
		}

	}

}
