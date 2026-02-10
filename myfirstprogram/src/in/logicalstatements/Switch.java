package in.logicalstatements;

import java.util.Scanner;

public class Switch {
//wap to print cricketer name based on his jersey number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a jersey number: ");
		;
		int j = sc.nextInt();
		switch (j) {
//case 7:
//	System.out.println("Ms dhoni");
//	break;
//case 18:
//	System.out.println("Virat Kohli");
//	break;
//case 45:
//	System.out.println("Rohit Sharma");
//	break;
//case 8:
//	System.out.println("Jaddu");
//	break;
//	default:
//		System.out.println("Unknown player");
//		break;
		case 7 -> System.out.println("Ms Dhoni");
		case 18 -> System.out.println("Virat Kohli"); // when we use -> no need to mention break keyword.

		case 45 -> System.out.println("Rohit Sharma");
		default -> System.out.println("Unknown");
		}
	}

}
