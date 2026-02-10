package in.logicalstatements;

import java.util.Scanner;

public class Factors {
void getFactors(int num) {
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			System.out.println(i);
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		Factors f=new Factors();
		f.getFactors(num);

	}

}
