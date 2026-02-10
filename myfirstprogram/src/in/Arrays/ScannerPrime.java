package in.Arrays;

import java.util.Scanner;

public class ScannerPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[7];
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		System.out.println("Read elements from console: ");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		
		}
		System.out.println("Prime numbers are:");
		for(int n:num) {
			boolean status=true;
			if(n==0||n==1) {
				status=false;
			}
			for(int j=2;j<n;j++) {
				if(n%j==0) {
					status=false;
					break;
				}
			}
			if(status) {
				System.out.println(n);
			}
		}
		
	
		

	}

}
