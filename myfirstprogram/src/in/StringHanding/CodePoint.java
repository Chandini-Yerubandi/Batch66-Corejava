package in.StringHanding;

import java.util.Scanner;

//A->65,a=97
public class CodePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Main method Started");
		System.out.println("Enter String: ");
		String s=sc.next();
		System.out.println(s.codePointAt(0));//c->99,n->97+14-1=110 asscii values
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(2,6 ));
	}

}
