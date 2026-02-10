package in.logicalstatements;

public class For {
	//0 to 10 even numbers and odd numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers: ");
		for(int i=2;i<=10;i++) {
			if(i%2==0) {
			System.out.println(i+" ");
		}
		}
		System.out.println("Odd numbers");
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i+" ");
			}
		}
	}

}
