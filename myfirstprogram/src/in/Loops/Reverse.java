package in.Loops;

import java.util.Scanner;

public class Reverse {
	static int FindReverse(int n){
		int rev=0;
		while(n!=0) {	
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n= sc.nextInt();
		int rev=FindReverse(n);
		System.out.println("Reverse number is: "+rev);
		if(n==rev) {
			System.out.println(+n+" is palindrome");
		}else {
			System.out.println(+n+"is not a palindrome");
		}
	}

}
