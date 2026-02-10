package in.logicalstatements;
import java.util.Scanner;
public class Nestedifelse {
//wap for very small console based matrimonial app
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Vcube Matrimorial !!");
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name: ");
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println("Wahat about your salary");
		double salary=sc.nextDouble();
		System.out.println("What is your assets");
		double property=sc.nextDouble();
		if(salary>=2500000.00 || property>=5000000) {
			System.out.println("Ok Good to Know");
			System.out.println("What is your age");
			int age=sc.nextInt();
			if(age<=26&& age>=22) {
				System.out.println("Ok fine to proceed");
				System.out.println("Enter your height");
				float height=sc.nextFloat();
				System.out.println("Enter your weight");
				float weight=sc.nextFloat();
				if((height>=5.5 && height<=6.0)&& (weight<=72 && weight>=65)){
					System.out.println("Ok we almost ok");
					System.out.println("Do you smoke or drink");
					boolean status=sc.nextBoolean();
					if(!status) {
						System.out.println("Happy to listen");
						System.out.println("Enter your siblings");
						boolean sibstatus=sc.nextBoolean();
						if(!sibstatus) {
							System.out.println("Actually youur profile 10th profile we will com back after 2 months");
						}
						else {
							System.out.println("Sorry to proceeed i don't want any sisterinlaws");
						}
					}
					else {
						System.out.println("sorry to proceed");
					}
				}
				else {
					System.out.println("You must join to gym");
				}
			}else {
				System.out.println("Your age is not matching");
			}
		}
		else {
			System.out.println("Sorry !! you can leave for the day");
		}

	}

}
