package in.fundamentals;
import java.util.*;
public class method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		method4 m=new method4();
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		m.sub(a,b);
		m.div(a, b);
		m.mod(a, b);
		sc.close();
		
		

	}
	void sub(int x,int y) {
		System.out.println("Sub: "+(x-y));
	}
	void div(int m,int n) {
		System.out.println("Div: "+(m/n));
	}
	void mod(int s,int t) {
		System.out.println("Mod: "+(s%t));
	}

}
