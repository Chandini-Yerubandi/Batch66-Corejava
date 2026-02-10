package programs;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
//	void Swap(int a,int b) {
//	int temp=0;//third variable
//	temp=a;
//	a=b;
//	b=temp;
//		System.out.println("After Swapping");
//		System.out.println("Value of A: "+a);
//		System.out.println("Value of B: "+b);
//	}

	void Swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping");
		System.out.println("Value of A: " + a);
		System.out.println("Value of B: " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  A value: ");
		int a = sc.nextInt();
		System.out.println("Enter B value: ");
		int b = sc.nextInt();
		SwapWithoutThirdVariable s = new SwapWithoutThirdVariable();
		s.Swap(a, b);
	}

}
