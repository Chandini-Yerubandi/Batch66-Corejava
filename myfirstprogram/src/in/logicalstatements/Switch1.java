package in.logicalstatements;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day: ");
		int day=sc.nextInt();
		Switch1 s=new Switch1();
		System.out.println(s.getDayInfo(day));
	}
 String getDayInfo(int day) {
	 return switch (day) {
	case 1->"Sunday,Always funday";
	case 2->"Monday";
	case 3,7->"Tuesday || Saturday";
	case 4->"Wednesday";
	case 5->"Thursday";
	case 6->"Friday";
	//case 7->"Saturday";
	
	default->"Invalid";
	
};//block can be closed by ;
}
}

