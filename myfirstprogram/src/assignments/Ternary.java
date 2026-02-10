package assignments;
import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter marks: ");
		int marks=sc.nextInt();
		String grade=marks>=90?"A":marks>=75?"B":marks>=65?"C":"Fail";

		System.out.println("Name of the student: "+name);
		System.out.println("Marks of the student: "+marks);
		System.out.println("Grade of the student: "+grade);
		sc.close();
	}

}
