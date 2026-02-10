package in.Loops;

import java.util.Scanner;

public class SumOfDigits {
static int SumOfDigits(int n) {
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit: ");
		int n=sc.nextInt();
		int sum=SumOfDigits(n);
		System.out.println("Sum of Given Digit is: "+sum);
	}

}
