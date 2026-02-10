package assignments;
import java.util.*;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter your age: ");
float age=sc.nextFloat();
if(age>0&& age<=5) {
	System.out.println("Child");
}
else if(age>=6&&age<=12) {
	System.out.println("Kid");
}else if(age>=13&&age<=19) {
	System.out.println("Teen");
}else if(age>=20&&age<=35) {
	System.out.println("young");
}else if(age>=36&&age<60) {
	System.out.println("Middle age");
}else if(age>=60) {
	System.out.println("Old age");
}
else {
	System.out.println("Invalid age");
}
	}

}
