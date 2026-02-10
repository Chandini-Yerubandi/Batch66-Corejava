package in.Loops;

import java.util.Scanner;

public class DecToBin {
String ConToBin(int n) {
	int rem=0;
	String str="";
	while(n!=0) {
		rem=n%2;
		n=n/2;//because we want 0,1 s
		str=rem+str;//when we give str first and rem nxt it prints original order but we want reverse reminders
	}return str;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		DecToBin d=new DecToBin();
		System.out.println("Enter a num: ");
		int n=Sc.nextInt();
		String c=d. ConToBin(n);
		System.out.println("Binary value is:"+c);
	}

}
