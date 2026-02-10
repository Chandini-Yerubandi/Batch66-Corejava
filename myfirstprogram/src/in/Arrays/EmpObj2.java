package in.Arrays;

public class EmpObj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpObjects e=new EmpObjects(1,"chandini",21,5000000.00);
		EmpObjects e1=new EmpObjects(1,"ratna",20,6000000.00);
		EmpObjects e2=new EmpObjects(1,"durga",15,4000000.00);
		EmpObjects[] emp=new EmpObjects[3];
		emp[0]=e;
		emp[1]=e1;
		emp[2]=e2;
		for(int i=0;
				i<emp.length;i++) {
			System.out.println(emp[i]);
		}



	}

}
