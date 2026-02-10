package in.oops;
class Employee{
	int eid;
	String name;
	Address1 address1;
	public Employee(int eid, String name, Address1 address1) {
		super();
		this.eid = eid;
		this.name = name;
		this.address1 = address1;
	}
	public Employee(Employee e1) {
		this.eid=e1.eid;
		this.name=e1.name;
		this.address1=new Address1(e1.address1);//new copy
	}
	
}
class Address1{
	String street;

	public Address1(String street) {
		super();
		this.street = street;
	}

	public Address1(Address1 address1) {
		super();
		this.street=address1.street;
	}
	
	
}
public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address1 a=new Address1("Kphb");
		Employee e1=new Employee(101,"Chandini",a);
		System.out.println(e1.eid);
		System.out.println(e1.name);
		System.out.println(e1.address1.street);
		System.out.println("*********************************************");
		Employee e2=new Employee(e1);//copying one obj data into another obj data
		System.out.println(e2.eid);
		System.out.println(e2.name);
		System.out.println(e2.address1.street);
		System.out.println("*********************************************");
		
		System.out.println("After updation");
		e2.address1.street="Nagar";//every time creating new obj is called deep copy
		System.out.println(e1.eid);
		System.out.println(e1.name);
		System.out.println(e1.address1.street);
		System.out.println("*********************************************");
		System.out.println(e2.eid);
		System.out.println(e2.name);
		System.out.println(e2.address1.street);
		System.out.println("*********************************************");
		
	}

}
