package assignments;

public class Demo {
	 
	public static void main(String[] args) {
		
		Demo d =new Demo();
		int square=d.getsquare();
		System.out.println("Square: "+square);
		int cube=d.getcube();
		System.out.println("Cube: "+cube);
		
		

	}
	int getsquare() {
		int x=2;
		int square=0;
		square=x*x;
		return square;
	}
	 int getcube() {
		int y= 3;
		int cube=0;
		cube=y*y*y;
		return cube;
	}
	

}
