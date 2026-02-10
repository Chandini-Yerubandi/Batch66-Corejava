package in.StringHanding;

import java.util.Scanner;

public class MaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started!");
		Scanner Sc=new Scanner(System.in);
		String str=new String("abbccc");
		int arr[]=new int[127];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			
		}
		int max=-1;
		char c=' ';
		for(int i=0;i<str.length();i++) {
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.println("Max occurance for string is: "+c);
		System.out.println("max value is: "+max);
	}

}
