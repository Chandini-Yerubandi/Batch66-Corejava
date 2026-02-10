package in.operators;

import java.util.Scanner;

public class Assignment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		int result=0;
		result=result+a;
		result=result+15;
		//result=result+5.5;//Type mismatch: cannot convert from double to int
		result+=5.5;//result=result+5.5; the above get error so we use assignment operator
		//result=result-10.5;//type mismarch
		result-=10;
		//result*10.5; type mismatch
		result*=10.5;
		//result=result/10.5;type missmatch
		result/=10.5;
		//result=result%10.5 type missmatch
		result%=10.5;
		
		System.out.println("Result: "+result);
		

	}

}
