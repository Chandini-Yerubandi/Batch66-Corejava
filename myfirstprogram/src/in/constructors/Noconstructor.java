package in.constructors;

public class Noconstructor {
	int id;
	int roll;
	String name;
	Noconstructor(){
		id=2;
		name="chandini";
		roll=12;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noconstructor n= new Noconstructor();
		
		
		n.display();

	}
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
	}

}
