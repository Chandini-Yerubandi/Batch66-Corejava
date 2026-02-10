package in.fundamentals;
//no return with arguments
import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll number: ");
		int r=sc.nextInt();
		System.out.println("Enter First Name: ");
		sc.nextLine();//whenever we give this before the variable line it will give chance to enter the value
		String s=sc.nextLine();//next means its print only one token in the given strings	
		System.out.println("Enter Last name: ");		
		String Lastname=sc.nextLine();
		
		System.out.println("Enter gender: ");
		char c=sc.next().charAt(0);
		Student(r);
		Name(s,Lastname);
		Char(c);
		sc.close();
		

	}
	static void Student(int r) {
		System.out.println("Original Roll Number:JFS-66-"+r);
	}
	static void Name(String s,String Lastname) {
		System.out.println("Full Name of the student: "+ s + Lastname );
	}
	static void Char(char c) {
		System.out.println("Gender: "+c);
	}

}
