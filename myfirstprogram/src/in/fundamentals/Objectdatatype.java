package in.fundamentals;
//import java.math.BigDecimal;//ctlr+shift+o
//import java.math.BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;
//we can create so many classes in one program
//to declare user defined datatypes
class Dog{
	String dname;
	Dog(String dogname){
		dname=dogname;
		
	}
	
}
class Car{
	String cname;
	Car(String Carname){
		cname=Carname;
		
	}
	
}

public class Objectdatatype {
	//regular object datatypes
	String name = "Chandini";//String Literalls
	String name1= "Vcube";//String object
	BigInteger bi = new BigInteger("1234");
	BigInteger bi1 = new BigInteger("1236");
	BigDecimal bd = new BigDecimal(10234567);
	BigDecimal bd1 = new BigDecimal(10234567234123456L);//prints long integer

	StringBuffer sb=new StringBuffer("Medidi Chandini");
	StringBuilder sb1= new StringBuilder("Good Morning");
	
	//predefined wrapper object datatypes
	Integer in = 1000000;//primitive to wrapper----->auto boxing
	Short sh=5000;
	Float f=20.5F;    
	Character ch=65;
	
	int in1=in;//wrapper to primitive---->auto unboxing
	short s1=sh;
	float f1=f;
	char ch1=ch;
	
	//user defined datatypes
	Dog d = new Dog("Puppy");
	Car c=new Car("Mahendra");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Objectdatatype O=new Objectdatatype();
		String S="100";
		int a=Integer.parseInt(S);
		System.out.println(a+500);
		//Arithmetic operations
		System.out.println(O.bi.add(O.bi1));
		System.out.println(O.bi.multiply(O.bi1));
		System.out.println(O.bi.divide(O.bi1));
		System.out.println(O.bi.subtract(O.bi1));


		//Accesing object datatypes
		System.out.println(O.name);
		System.out.println(O.name1);
		System.out.println(O.bi);
		System.out.println(O.bd);
		System.out.println(O.bd1);
		System.out.println(O.sb);
		System.out.println(O.sb1);

		
		//Accessing wrapper odt
		System.out.println(O.in);
		System.out.println(O.sh);
		System.out.println(O.f);
		System.out.println(O.ch);
		
		System.out.println(O.in1);
		System.out.println(O.s1);
		System.out.println(O.f1);
		System.out.println(O.ch1);

		
//		//Accessing user defined datatypes
		System.out.println(O.d.dname);
		System.out.println(O.c.cname);
	}

}
