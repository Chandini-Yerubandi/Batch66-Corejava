package in.multithreading;

public class Multi1 extends Thread {//1.extends thread
//	void hello() {
//		System.out.println("Void method called");
//	}
//	void welcome() {
//		System.out.println("Welcome method called");
//	}
	@Override//2.override run method
	public void run() {//used to create thread 
		System.out.println(Thread.currentThread());//cpu information

		System.out.println("Welcome method called");
		System.out.println("Welcome method called");
		System.out.println("Welcome method called");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread());//cpu information
		Multi1 m=new Multi1();
		m.start();//thread to begin execution the jvm calls the run method of this thread//3.call start method
		//System.out.println(m);//address of object
		System.out.println(Thread.currentThread());//cpu information

		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");

		System.out.println(Thread.currentThread());//cpu information

//		m.hello();
//		m.welcome();

	}

}
