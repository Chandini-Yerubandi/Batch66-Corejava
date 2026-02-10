package in.oops;

public class Person {
	int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Person Called!");
//		Person p=new Person();
//		p.method1();
		

	}void method1(){
		System.out.println("Method1 Called");
	}

}
class Student1 extends Person{
		int j=20;
	public static void main (String args[]) {
		Student1 s= new Student1();
		//Person p=new Person();
		System.out.println("Student Called!");
		System.out.println(s.i);
		System.out.println(s.j);
		s.method1();

		s.method2();
	}
	void method2() {
		System.out.println("Method2 Called!");
	}
}
