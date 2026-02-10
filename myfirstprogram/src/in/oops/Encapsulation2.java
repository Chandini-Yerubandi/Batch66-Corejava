package in.oops;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 e=new Encapsulation1();
		
		e.setEid(566);
		e.setEname("Chandini");
		System.out.println(e.getEid());
		System.out.println(e.getEname());//using setter and getter methods we cannt access the data from another class by using access specifier,data modification,read the data

	}

}
