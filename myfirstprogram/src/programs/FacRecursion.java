package programs;

import java.util.Scanner;

public class FacRecursion {
int Fac(int n) {
	if(n==0||n==1) {
		return 1;
	}
	return n*Fac( n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FacRecursion f=new FacRecursion();
		System.out.println("Enter a num to find factorial: ");
		int n=sc.nextInt();
		int fac=f.Fac(n);
		System.out.println("Factorial of "+n+" is "+fac);
		sc.close();
	}

}
