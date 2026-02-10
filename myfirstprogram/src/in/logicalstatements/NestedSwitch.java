package in.logicalstatements;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a category");
		String c = sc.next();
		switch (c) {
		case "Veggies" -> {
			System.out.println("Enter veg");
			String v = sc.next();
			switch (v) {
			case "tomato" -> System.out.println("Tomato and the 1kg cost is 50rs");
			case "potato" -> System.out.println("Potato and the 1kg cost is 60rs");
			default -> System.out.println("Out of stock");
			}
		}
		}
		switch (c) {
		case "fruits" -> {
			System.out.println("Enter fruits: ");
			String f = sc.next();
			switch(f) {
			case "apple" -> System.out.println("Dozen apples 100");
			case "grapes"->System.out.println("kg grapes 200");
			default->System.out.println("Out of stock");
			}

		}
		}
	}

}
