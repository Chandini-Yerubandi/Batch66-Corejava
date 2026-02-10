package in.logicalstatements;

import java.util.Scanner;

public class Arithop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		double a=sc.nextDouble();
		System.out.println("Enter b number:");
		double b= sc.nextDouble();
		System.out.println("Enter symbol:");
		String s=sc.next();
		switch(s) {
		case "+" -> System.out.println("Addition: "+(a+b));
		case "-"->System.out.println("Subtraction: "+(a-b));
		case "/"-> System.out.println("Division: "+(a/b));
		case "%"->System.out.println("Modulo: "+(a%b));
		case "*"->System.out.println("Multiplication: "+(a*b));
		default -> System.out.println("Invalid Symbol");
		}

	}

}
