package in.constructors;

public class Conschaining {
	int id;
	String name;
	int age;
	Conschaining(){
		this("Unknown");
		System.out.println("No arg Constructor called!");
	}
	Conschaining(String name){
		this(22,name);
		System.out.println("One arg cons with string cons");
		//this.name=name;
	}
	Conschaining(int age,String name){
		this(501,name,23);
//		this.age=age;
//		this.name=name;                                  code reusesability,reduce duplication we use cons chaining
		System.out.println("two arg cons called!");
	}
	Conschaining(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println("Three arg cons called!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Conschaining c= new Conschaining();
		c.display();
		System.out.println("*********************");

	Conschaining c1= new Conschaining(23,"Chandini");//we call 2 arg but it calls 3 arg con also np need to assign variables in that arg
		c1.display();
		

	}
void display() {
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	
}
}
