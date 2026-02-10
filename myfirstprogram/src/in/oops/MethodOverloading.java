package in.oops;
public class MethodOverloading {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		MethodOverloading m= new MethodOverloading();
		m.add();
		m.add(10);
		m.add(10,20);//here i call integer instead of float(method is expecting float) so this is called flexibility in polymorphism
	}
	void add() {
		System.out.println("Addition method with no arg");
	}
	void add(int a) {
		System.out.println("Addition method with int arg");
	}
	void add(float a,float b) {
		System.out.println("Addition method with float float args");
	}
}
