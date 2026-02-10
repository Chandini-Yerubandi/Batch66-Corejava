package assignments;

import java.util.Scanner;

public class Recharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice");
		Recharge r=new Recharge();
		int price=sc.nextInt();
		
		System.out.println(r.getRechargeDetails(price));
	}
String	getRechargeDetails(int price){
		return switch(price) {
		case 1->" Plan Price is 199 ,Validity is 28 days and 1.5GB/day";
		case 2->"Plan Price is 399 ,Validity is 56 days and 1.5GB/day";
		case 3->"Plan Price is 599 ,Validity is 84 days and 2GB/day";
		default->"Invalid Choice Please Select 1,2 or 3 plans";
		};
	}

}
