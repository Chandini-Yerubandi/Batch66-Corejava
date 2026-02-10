package in.constructors;

public class Parameterized {
	int id;
	String name;
	int roll;
	Parameterized(int id, String name,int roll){
		System.out.println("Parameterized constructor called");
		this.id=id;
		this.name=name;
		this.roll=roll;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized p=new Parameterized(501,"chandini",1);
		System.out.println("ID: "+p.id);
		System.out.println("Name: "+p.name);
		System.out.println("roll: "+p.roll);
		

	}

}
