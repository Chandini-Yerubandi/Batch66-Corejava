package in.fundamentals;
import java.util.Scanner;
//in java default package is java.lang
//no return with arg
public class Method3 {

	public static void main(String[] args) {
		//String s= new String();//rhs=object lhs =reference
		Scanner sc= new Scanner(System.in);//input stram=in,output stream=out
		System.out.println("enter a number: ");
		int a=sc.nextInt();//scans nxt token of the int as input
		System.out.println("Enter anotje");
		int b=sc.nextInt();
		add(a,b);//call by value
		sc.close();
		
	}
	//no return type with arguments--->scanner
	static void add(int x,int y) {
		System.out.println("Addition"+(x+y));
	}

}
