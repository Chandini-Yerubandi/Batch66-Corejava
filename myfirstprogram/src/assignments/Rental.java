package assignments;

import java.util.Scanner;
class TotalClass{
	
}

public class Rental {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rental r=new Rental();
		Scanner sc=new Scanner(System.in);
		System.out.println(Message());
		System.out.print("Enter how many days for rent: ");
		int n=sc.nextInt();
		System.out.println("Name of the company is: "+Company());
		System.out.println("Insurence fee: "+InsurenceFee());
		sc.close();
		System.out.println("Total cost: "+TotalCost(n));//base rental cost+insurence fee
		

	}
	static String Company() {
	String name="Zoomcar Rentals";
	return name;
	}
	static int InsurenceFee() {
		int fee=500;
		return fee;
	}
	static String Message() {
		String s= "Welcome message for customers";
		return s;
	}
	static int TotalCost(int n) {
		int rate=1500;

		int t=(n*rate)+InsurenceFee();
		return t;
	}
	
}
