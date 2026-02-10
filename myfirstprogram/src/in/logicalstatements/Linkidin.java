package in.logicalstatements;

import java.util.Scanner;

public class Linkidin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hr contacting Student through linkidin page");
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("Hello " + name + " Nice to meet you");
		System.out.println("Which year passed out?");
		long year = sc.nextLong();
		if (year >= 2022 && year <= 2025) {
			System.out.println("Nice...");
			System.out.println("Is there any career Gap?");
			boolean gap = sc.nextBoolean();
			System.out.println("What are your skills??");
			String skills = sc.next();
			if ( skills.equalsIgnoreCase("java")||skills.equalsIgnoreCase("python")) {
				System.out.println("Yeah ok...");

				if (!gap) {
					System.out.println("Ok...then");
					System.out.println("Are you fresher!!");
					boolean fstatus = sc.nextBoolean();
					if (!fstatus) {
						System.out.println("Then How many of experience you have??");
						int exp = sc.nextInt();
						if (exp > 4) {
							System.out.println("How much CTC would you expect?");
							long ctc = sc.nextLong();
							System.out.println("Ok...If there any update my team will contact you");
						} else {
							System.out.println("Ok...If there any update my team will contact you");
						}
					} else {
						System.out.println("Ok no problem we are looking for freshers also..");
					}
				} else {
					System.out.println("Sorry to Say that we are looking only no career gap  students");
				}
			} else {
				System.out.println("ok thankyou...if there any update we will intimate you");
			}
		} else {
			System.out.println("Oh sorry..We are searching for the studends passed out between 2022 and 2025");
		}

	}

}
