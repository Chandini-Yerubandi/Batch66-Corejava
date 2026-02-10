package programs;

import java.util.Scanner;

public class Factorial {
//5!=5x4x3x2x1
static	int Factorial(int n) {
	int fac=1;
		for(int i=n;i>=1;i--) {
			
			fac=fac*i;
			
		}
	return fac;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Factorial f=new Factorial();
System.out.println("Enter number to find factorial:");
int n=sc.nextInt();
int fac=f.Factorial(n);
System.out.println("Factorial of "+n+" is "+fac);

	}

}
