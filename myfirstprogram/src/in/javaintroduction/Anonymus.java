package in.javaintroduction;

public class Anonymus {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method");
	}
	
	
	void show() {
		Anonymus c= new Anonymus();               //object created inside the method
	}
	
	
	public static void main(String[] args) {	
		System.out.println("Main method started");
		Anonymus a = new Anonymus();
		System.out.println(a);//address of an object a
		a.show();                                              //3.object created inside the method
		//	a=null;                                            //1.nullifying the object
		
		
		
		
		Anonymus b= new Anonymus();
		System.out.println(b);//address of an object b
//		a=b;                                                   //2.reassigning the object
		
		
		new Anonymus();                                        //4.anonymus objects
	    System.gc();
		System.out.println("Main method ended");
		

	}

}
