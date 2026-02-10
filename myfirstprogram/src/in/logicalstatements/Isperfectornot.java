package in.logicalstatements;

import java.util.Scanner;

public class Isperfectornot {
boolean isPerfect(int n) {
	int Sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			Sum=Sum+i;
		}
		
	}
	return Sum==n;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		Isperfectornot i=new Isperfectornot();
		i.isPerfect(n);
		Boolean isPerfect=i.isPerfect(n);
		if(isPerfect) {
			System.out.println(n+" Is a perfect number");
		}
		else {
			System.out.println(n+" Is a not a perfect number");

		}
		
		

	}

}
