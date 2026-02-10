package in.fundamentals;
import java.util.*;

public class Bank {
	int acno=1234;
	String acname="Chandini";
	int balance=20000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank b= new Bank();
		System.out.println("Enter withdraw amount");
		int w=sc.nextInt();
		System.out.println("Enter deposit amount");
		int d=sc.nextInt();
		int g=b.withdraw(b.balance,w);
		System.out.println("Withdraw amount: "+g);
		int f=b.deposit(b.balance,d);
		System.out.println("Deposited amount: "+f);
		sc.close();
		

	}
	int withdraw(int x,int y) {
		int g=x+y;
		return g;
	}
	int deposit(int a,int b) {
		int f=a-b;
		return f;
	}

}
