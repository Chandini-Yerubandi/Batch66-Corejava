package in.fundamentals;

public class Identifiers {
	int id;
	String name;

	public static void main(String[] args) {        //total 13  identifiers in this program 
		Identifiers i = new Identifiers();           //  1.in  - package
		System.out.println(i.id);//0                   2.fundamentals - package
		System.out.println(i.name);//null              3.identifiers - class
		i.method1();                                   //4.id    - variable
		// TODO Auto-generated method stub             5.name  - variable
                                                      // 6.String -predefined class
	}                                                 // 7.main   - method
	void method1() {                                  // 8.args  - arguments
		System.out.println("Method 1 called");         //9.System  - predefined class
	}                                                  //10.out - variable
                                                       //11.println - method
}                                                      //12.method1();-method
                                                       //13.i - reference variable