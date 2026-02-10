package in.constructors;

public class Defaultconstructor {
	int id;
	String name;
	int roll;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultconstructor d= new Defaultconstructor();
		d.display();

	}
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}
}
