package in.StringHanding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Main method Started");
		System.out.println("Enter String: ");
		String s=sc.next();
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not Palindrome");
		}

	}

}
