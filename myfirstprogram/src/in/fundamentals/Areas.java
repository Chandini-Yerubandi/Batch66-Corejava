package in.fundamentals;

import java.util.Scanner;

public class Areas {
//Area of tri,Area of Circle,square,rectangle,circle
	// tri: 1/2 bh square: s*s rectangle:l*b circle: pi*r*r
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a = sc.nextInt();
		System.out.println("Enter another number");
		double b = sc.nextInt();
		double x = AreaOfTriangle(a, b);
		System.out.println("Area of triangle: " + x);
		double y = AreaOfRec(a, b);
		System.out.println("Area of Rectangle: " + y);
		double z = AreaOfCircle(a);
		System.out.println("Area of circle: " + z);
		double w= AreaOfSquare(a);
		System.out.println("Area of Square: "+w);
		}

	

	static double AreaOfTriangle(double x, double y) {
		double area = 0;
		area = 0.5 * x * y;
		return area;
	}

	static double AreaOfSquare(double s1) {
		double aos = 0;
		aos = s1 * s1;
		return aos;
	}

	static double AreaOfRec(double l, double b) {
		double aor = 0;
		aor = l * b;
		return aor;
	}

	static double AreaOfCircle(double r) {
		double aor = 0;
		aor = 3.4 * r * r;
		return aor;
	}

}
