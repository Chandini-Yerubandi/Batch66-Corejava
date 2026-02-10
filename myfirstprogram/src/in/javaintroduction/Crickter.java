package in.javaintroduction;
//in static area we cannot access instance data members directly
//if we want to access instance data in static area we must create an object in java
//when the data is same for all the objects then we give static for those variable
//whenever the data is changing from object to object then we can give instance for those objects

public class Crickter {
	//Declaration
	//instance variables or non-static
	int jerseyNo;
	String Names;
	
	//static variables
	static int ID;
	static String num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started");
		System.out.println("Welcome to indian cricket team !!");
		
		//creating an object
		Crickter dh=new Crickter();
		
		//initialization
		ID=566;
		num="66";
		dh.jerseyNo=7;
		dh.Names="MSD";
		
		//accessing the static data
		System.out.println("Country ID : "+ID);//0 there is no initialization for ID so default value for integer is zero
		System.out.println("Country num : " +num);//null "  "              num        "             string  "  null
          
		//accessing the instance data or non-static data
		//System.out.println(jerseyNo);//error
		//System.out.println(Names);//error
		 
		System.out.println("Jersy num : "+dh.jerseyNo);//0
		System.out.println("Jersy name : "+dh.Names);//null
		
		
		
		System.out.println("Second object created");
		Crickter vi=new Crickter();
		vi.jerseyNo=18;
		vi.Names="Virat";
		System.out.println("Country ID : "+ID);
		System.out.println("Country num : " +num);
		System.out.println("Jersy num : "+vi.jerseyNo);
		System.out.println("Jersy name : "+vi.Names);


	}

}
