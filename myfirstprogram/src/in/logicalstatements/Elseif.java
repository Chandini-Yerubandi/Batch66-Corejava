package in.logicalstatements;

import java.util.*;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks percentage: ");
		double marksp = sc.nextInt();
		if (marksp > 100 || marksp < 0) {
			System.out.println("Invalid marks percentage");
		} else if (marksp >= 90) {
			System.out.println("Grade A");
		} else if (marksp >= 80) {
			System.out.println("Grade B");
		} else if (marksp >= 70) {
			System.out.println("Grade C");
		} else if (marksp >= 60) {
			System.out.println("Grade D");
		} else if (marksp >= 35) {
			System.out.println("Just passed");
		}

		else {
			System.out.println("Fail");
		}
	}

}
