package in.StringHanding;

public class Stringex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1="Hyderabad";
		String c2="Hyderabad";
		String c3="Hyderabad";
		c1="Chennai";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		
		String s1="chandini";
		String s2="java";
		s1.concat(s2);
		System.out.println(s1);
		s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		
		
		Stringex2 s=new Stringex2();
		System.out.println(s);//address of obj
		String s4=new String();
		System.out.println(s4);//empty line
		System.out.println("Chandini");
		
		
		int[]numbers= {1,2,3,4,5};
		System.out.println(numbers);//address of array obj
		
		char[] ch= {'A','B','C'};
		System.out.println(ch);//ABC
		System.out.println(s.hashCode());//returns int value of an object reference
		
		int i=0X5ca881b5;
		System.out.println(i);
	}

}
