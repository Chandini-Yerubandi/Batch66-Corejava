package in.javaintroduction;
class Student2{
	Student2 s;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
}

public class Island {
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
	    s1.s=s2;
	    s2.s=s1;
//		
		System.out.println(s1.s);
		System.out.println(s2.s);
		s1=null;
     	s2=null;
		
		System.gc();
	}
	
		

	}


