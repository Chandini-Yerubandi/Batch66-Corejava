package in.oops;
class D{
	int a=10;
}
class E extends D{
	int b=20;
}
class F extends E{
	int c=30;
	
}
public abstract class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F c= new F();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);

	}

}
