package in.fundamentals;
public class Employee {
	String empname="King";
	Integer earnings=27000;
	Float   pf=0.05F;
	Float   cgst=0.07F;
	Float   DA=0.03F;
	Float   pfd=(earnings*pf);
	Float   cgstd=(earnings*cgst);
	Float   DAc=(earnings*DA);
	Float    Total_salary=earnings-pfd-cgstd+DAc;
 
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("pf detuction: "+e.pfd);
		System.out.println("cgst detuction: "+e.cgstd);
		System.out.println("DA  credits: "+e.DAc);
		System.out.println("Total Monthly Salary: "+e.Total_salary);
    	System.out.println("Annual salary: "+e.Total_salary*12);


		// TODO Auto-generated method stub

	}

}
