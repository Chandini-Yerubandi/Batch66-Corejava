package in.javaintroduction;

public class Staticvsinstance {
	static {
		System.out.println("Static block called");
	}
	
	{
		System.out.println("Instance method called");
	}

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Staticvsinstance s = new Staticvsinstance();
		// TODO Auto-generated method stub

	}

}
