package in.fundamentals;

import java.util.Scanner;

public class Method7 {
//with return+with Arguments
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a=sc.nextInt();
		System.out.println("Enter second number");
		double b=sc.nextInt();
		double sum=addition(a,b);
		System.out.println("Sum: "+sum);
		float sub=sub(sum,50);
		System.out.println("Sub: "+sub);
		int mul = (int) mul(sub, 3);
		System.out.println("Mul: "+mul);
		sc.close();

	}
	static float mul(double x,int y) {
		float mul=(float) (x*y);
		return mul;
	}
	static float sub(double x,double y) {
		float sub=(float) (x-y);
		return sub;
	}
	static double addition(double x,double y) {
		double sum=0;
		sum=x+y;
		return sum;
	}

}
