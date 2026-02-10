package in.fundamentals;

import java.util.Scanner;

//return type with noarguments
public class Method6 {
	Scanner sc= new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method6 m=new Method6();
		double salary=m.Salary();
		System.out.println("Salary: "+salary);
		m.Bonus();

	}
	double Salary() {
		System.out.println("Enter salary: ");
		double salary=sc.nextDouble();
		return salary;
	}

	double Bonus() {
		System.out.println("Bonus: ");
		return sc.nextDouble();
	}

}
