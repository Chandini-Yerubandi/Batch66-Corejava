package assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		long year=sc.nextLong();
		if(year%4==0 &&(year%100!=0 || year%400==0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
