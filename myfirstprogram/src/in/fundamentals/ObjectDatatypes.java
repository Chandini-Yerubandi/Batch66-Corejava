package in.fundamentals;

//import java.math.BigDecimal;
//import java.math.BigInteger;

public class ObjectDatatypes {
	//non primitive datatypes means object datatypes String,BigInteger,BigDecimal,StringBuffer,StringBuilder
   Integer Empno = 1;
	String Empname="Chandini";
	Integer Salary= 5000;
	Integer bonus =500*12;
	Integer Annual = 12*Salary;
	Integer Total=Annual+bonus;
//	BigDecimal total = new BigDecimal(bonus+Annual);
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDatatypes O = new ObjectDatatypes();
		
		System.out.println("Annual Salary: "+ (O.Salary*12));
		System.out.println("Annual bonus: "+ (O.bonus ));
		System.out.println("Total Earnings: "+O.Total);

	}

}
