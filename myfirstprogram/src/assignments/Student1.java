package assignments;

public class Student1 {
	int rollnumber;
	String name;
	String course;
	double fee;
	
	Student1(int rollnumber){
		System.out.println("Roll number: "+rollnumber);

	}
	Student1(int rollnumber,String name){
		this(rollnumber);
		System.out.println("NAME: "+name);

	}
	Student1(int rollnumber,String name,String course,double fee){
		this( rollnumber, name);
		this.name=name;
		this.rollnumber=rollnumber;
		this.course=course;
		this.fee=fee;
		System.out.println("Course: "+course);
		System.out.println("Fee: "+fee);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s= new Student1(501,"Chandini","Cse",234545.00);
		
	

	}
	

}
