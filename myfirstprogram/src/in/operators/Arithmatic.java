package in.operators;
import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		//System.out.println("Addition of two num: "+a+b);//1020
		System.out.println("Addition of two num: "+(a+b));
		//System.out.println("Subtraction of two num: "+a-b);//1020   it shows error
		System.out.println("Subtraction of two num: "+(a-b));//10
		System.out.println("Multiplication of two num: "+a*b);//both are same
		System.out.println("Multiplication of two num: "+(a*b));
		System.out.println("Division od two num: "+(a/b));//quotient
		System.out.println("Modulus: "+(a%b));//remanider

		


	}

}
