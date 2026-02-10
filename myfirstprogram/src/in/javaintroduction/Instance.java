package in.javaintroduction;

public class Instance {
	
	{
		System.out.println("Instance1");
	
	}
	public static void main(String[] args) {
		System.out.println("Main class started");
		//Instance i=new Instance();
		//System.out.println("Main class started");
		// TODO Auto-generated method stub

	}
	static{
		System.out.println("static");
		Instance i=new Instance();//instance object also created inside the static block also
	}
}
// in java,jvm first looks for main method,if there is no main method in a class it gives runtime error.
//if static blocks are there in a program ,first the static block will execute before the main method , 
//instance block will be loaded whenever object is created.
//if static variables are there first static variables will execute
//and if static blocks are there first static blocks will executed after that main block will executed.
//whenever we dont wnat to call methods but want to 
//execute functionalities before main method then we use static blocks.
