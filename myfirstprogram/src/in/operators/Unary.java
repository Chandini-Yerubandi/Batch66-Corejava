package in.operators;

public class Unary {
//	++ increment
//	a++ post increment
//	++a pre increment
//	a-- post decrement
//	--a pre decrement

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		//System.out.println(+a);//5
		//System.out.println(-a);//-5
		
		System.out.println(++a);//a=a+1=6
		System.out.println(++a);//a=a+1=6+1=7
		System.out.println(a++);// fst print 7-->increment to 8
		System.out.println(a++);//fst print 8-->increment to 9
		System.out.println("A value: "+a);//9
		

	}

}
