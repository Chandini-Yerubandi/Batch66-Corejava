package assignments;

public class Hospital {
	String name;
	long phno;
	String gender;
	double Salary;
	Hospital(String name,long phno,String gender,double Salary){
		this.name=name;
		this.phno=phno;
		this.gender=gender;
		this.Salary=Salary;
	}
	Hospital(Hospital h){
		this.name=h.name;
		this.phno=h.phno;
		this.gender=h.gender;
		this.Salary=h.Salary+(h.Salary*0.15);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!");
		Hospital doctor=new Hospital("Chandini",99999L,"F",20000);
		Hospital h=new Hospital(doctor);
		System.out.println("Before increment");
		doctor.show();
		System.out.println("After increment");
		h.show();
	}
	void show() {
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phno);
		System.out.println("Gender: "+gender);
		System.out.println("Salary: "+Salary);
	}

}
