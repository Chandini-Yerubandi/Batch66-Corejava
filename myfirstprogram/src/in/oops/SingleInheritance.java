package in.oops;


class A{
	int a =10;
	void method1() {
		System.out.println("Class A method called");
	}
}
class B extends A{
	int b=20;
	void method2() {
		System.out.println("Class B method called");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.method1();
		b.method2();
	}

}
