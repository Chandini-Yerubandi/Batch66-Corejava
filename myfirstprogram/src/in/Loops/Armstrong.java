package in.Loops;

import java.util.Scanner;

public class Armstrong {
	boolean IsArmStrong(int n) {
		boolean status=false;
		int temp=n;
		int rem=0;
		double arm=0;
		String str=Integer.toString(n);
		int length=str.length();
		while(n!=0) {
			rem=n%10;
			 arm=arm+Math.pow(rem, length);
			n=n/10;
			
		}
		if(temp==arm) {
		status=true;
	}return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a= new Armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean isarm=a.IsArmStrong(n);
		if(isarm) {
			System.out.println("Given num is ArmStrong num");
		}else {
			System.out.println("Given num is not ArmStrong num");
		}
	}

}
