package in.javaintroduction;

public class Student1 {
	//instance method
	void hello() {
		System.out.println("********hello*******" +Thread.currentThread().getName());//thread name
		System.out.println("********hello*******" +Thread.currentThread());//thread#1
		System.out.println("Hello guys");
	}
	
	
	
	//main method called by jvm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********main*******" +Thread.currentThread().getName());//thread name
		System.out.println("********main*******" +Thread.currentThread());//thread#1
		System.out.println("Main method started !");
		System.out.println("Student Info !");
		
		
		//calling static method
		welcome();
		
		
		//calling instance method
		Student1 s = new Student1();
		s.hello();
		System.out.println("Main method ended");
		
		
		
		

	}
	//static method
	public static void welcome() {
		System.out.println("********welcome*******" +Thread.currentThread().getName());//thread name
		System.out.println("********welcome*******" +Thread.currentThread());//thread#1
		System.out.println("Welcome to java world");
		System.out.println("Welcome to java world");
		System.out.println("Welcome to java world");
	}

}
