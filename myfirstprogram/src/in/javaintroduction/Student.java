package in.javaintroduction;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		System.out.println("Hello");
		System.out.println(Class.forName("in.javaintroduction.HelloVcube"));
		Class.forName("java.lang.System");
		Class.forName("com.mysql.cj.jdbc.Driver");
	}

}
