
package in.constructors;

public class Constructor1 {
	int eid;
	String ename;
	int eage;
	long phone;

	// no arg constructor
	Constructor1() {
		System.out.println("No constructor called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 e = new Constructor1();
		System.out.println("Emp id: " + e.eid);
		System.out.println("Emp name: " + e.ename);
		System.out.println(e.eage);
		System.out.println(e.phone);

		Constructor1 c = new Constructor1();// default constructor is used to create an object
		c.eid = 71;
		c.ename = "Chandini";
		c.eage = 12;
		c.phone = 1376544567;
		System.out.println("Emp id: " + c.eid);
		System.out.println("Emp name: " + c.ename);
		System.out.println(c.eage);
		System.out.println(c.phone);
	}

}
