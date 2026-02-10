package in.fundamentals;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method");
Methods m= new Methods();
m.hello();
Methods.show();
	}
	//method with no returntype and no arguments
	void hello() {
		System.out.println("Hello");
	}
	static void show() {
		System.out.println("Hi");
	}
}
