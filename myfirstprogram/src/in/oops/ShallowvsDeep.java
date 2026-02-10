package in.oops;
class  Students implements Cloneable{
	int id;
	String name;         //instance data
	//whenever we using cloning to copy object to object only  instance data will copy it doesn't copy internal references
	Address address;//internal reference
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public Students(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;             //1.use override clone method
		this.address = address;       //2.throw clonenotsupportedexception
									  //3.class must implements clonable
	}								//4.create explicit type caste to the object
	
}
class Address{
	String city;

	public Address(String city) {        //i made the copy of the object but i didn't copy the stuff inside thid only reference will copied
		                                  //so the outer objects get duplicate and inner objects are same	
		super();
		this.city = city;
	}
}
public class ShallowvsDeep {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Main methos Started");
		Address a=new Address("Hyd");
		Students s=new Students(566,"Chandini",a);
		System.out.println(s.name);
		System.out.println(s.address.city);
		System.out.println("*****************************************");
		Students s2=(Students)s.clone();      //creates and returns the object,clone methos access directly in sub class but we want use it in main method we must need to override in sub class.
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		System.out.println("*****************Shallow is happen************************");
		
		s2.address.city="Banglore";
		System.out.println("After sometime s ************");
		System.out.println(s.name);
		System.out.println(s.address.city);
		System.out.println("After sometime s2 ************");//it only copying partially with object references
		System.out.println(s2.name);
		System.out.println(s2.address.city);

	}

}
