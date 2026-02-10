package programs;

import java.util.Scanner;

public class Fibonacci {
void fib(int n){
	int n1=0;
	int n2=1;
	int n3;
	System.out.print(n1+" "+n2);
	for(int i=1;i<n-1;i++) {
		n3=n1+n2;
		System.out.print(" "+n3+" ");
		n1=n2;
		n2=n3;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find fibonacci: ");
		int n=sc.nextInt();
		Fibonacci f= new Fibonacci();
		f.fib( n);
		}

}
