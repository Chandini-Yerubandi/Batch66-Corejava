package in.javaintroduction;
//4 static methods
//4 instance methods
public class Methodsindifferentways {
	
	//type1-static method
	static void method1() {
		Methodsindifferentways m=new Methodsindifferentways();
		m.method2();

		System.out.println("Method1");
	}
	
	//type2-instance method
	void method2() {
		System.out.println("Method2");
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		method1();
//		Methodsindifferentways m=new Methodsindifferentways();
//		m.method2();

	}

}
