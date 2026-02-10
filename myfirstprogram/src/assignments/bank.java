package assignments;
import java.util.*;

public class bank {
	int accountno=12345;
	String account_holder="Chandini";
	 int balance=30000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		bank b= new bank();
		
		System.out.println("Enter withdraw amount:");//remove from balance
		int w=Sc.nextInt();
		System.out.println("Enter deposit amount:");//add to balance
		int d=Sc.nextInt();
		int g=b.withdraw(b.balance,w);
		int f=b.deposit(b.balance,d);
		System.out.println("Withdraw amount: "+g);
		System.out.println("Deposit amount: "+f);
		Sc.close();
		

	}
	int withdraw(int x,int y){
	int g=x+y;
	return g;
		
	}
	int deposit(int a,int b){
		int f=a-b;
		return f;
		
	}

}
