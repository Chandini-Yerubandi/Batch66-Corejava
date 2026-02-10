package assignments;

import java.util.*;


public class Sici {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		int pa=sc.nextInt();
		System.out.println("Enter rate of intrest: ");
		double r=sc.nextInt();
		System.out.println("Enter Time: ");
		double t=sc.nextInt();
		SimpleIntrest(pa,r,t);
		CompoundIntrest(pa,r,t);
		sc.close();

	}
	static void SimpleIntrest(double pa,double r,double t) {
		double si=(pa*t*r)/100;//si=ptr/100
		System.out.println("Simple Intrest: "+si);
	}
	static void CompoundIntrest(double pa,double r,double t) {
		int n=2;
		double A=pa*Math.pow((1+(r/(n*100))),n*t);//A=p(1+(r/n))^(n*t)	ci=A-pa    n=5%-->0.05--->5/100
		double ci=A-pa;
		System.out.println("Compound Intrest: "+ci);
	}

}
