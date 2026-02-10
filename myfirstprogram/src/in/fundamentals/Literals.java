package in.fundamentals;

public class Literals {
	Integer eid = 1;
	String ename = "Chandini";
	double sal = 100000.00;
	Address address= new Address();
	class Address{
		String flat ="abc";
		String City="AMP";
		String State="AP";
		long Pincode=533247;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Literals l= new Literals();
		System.out.println(l.eid);
		System.out.println(l.ename);
		System.out.println(l.sal);
		System.out.println(l.address.flat);
		System.out.println(l.address.City);
		System.out.println(l.address.State);
		System.out.println(l.address.Pincode);

		

	}

}
