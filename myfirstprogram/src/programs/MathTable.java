package programs;

import java.util.Scanner;

public class MathTable {
	void table(int num,int n) {

		for (int i = 1; i <= n; i++) {
			int mul = num * i;
			System.out.println(num + " * " + i + " = " + mul);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		MathTable m = new MathTable();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Enter a number up to where you want to print: ");
		int n = sc.nextInt();
		m.table(num,n);
	}

}
