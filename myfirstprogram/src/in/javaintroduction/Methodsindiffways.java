package in.javaintroduction;

public class Methodsindiffways {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		s1();
		System.out.println("Main method ended");

	}

	static void s1() {
		Methodsindiffways m = new Methodsindiffways();
		m.i5();
		System.out.println("Static method 1");
		
		
	}
	
	static void s2() {
		Methodsindiffways m = new Methodsindiffways();
		m.i6();
		System.out.println("Static method 2");
		
	}
	
	static void s3() {
		Methodsindiffways m= new Methodsindiffways();
		m.i7();
		
		System.out.println("Static method 3");
		
	}
	
	static void s4() {
		Methodsindiffways m = new Methodsindiffways();
		m.i8();
		System.out.println("Static method 4");
	}
	// can we call static method inside the instance methods-yes
	//call with class name
	void i5() {
		Methodsindiffways.s2();
		i6();
		System.out.println("Instance method 1");
		
		
		
	}
	
	void i6() {
		s3();
		System.out.println("Instance method 2");
		
	}
	
	void i7() {
		
		Methodsindiffways.s4();
		System.out.println("Instance method 3");
	}
	
	void i8() {
		System.out.println("Instance method 4");
	}

	
}
