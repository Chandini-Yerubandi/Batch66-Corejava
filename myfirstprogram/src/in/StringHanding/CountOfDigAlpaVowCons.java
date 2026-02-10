package in.StringHanding;

import java.util.Scanner;

public class CountOfDigAlpaVowCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Main method Started!");
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter String: ");
	 String s=sc.next();
	 int digCount=0,Alpcount=0,VowelCount=0,ConsonentCount=0;
	 
	 
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 ch = Character.toUpperCase(ch);
		 if(ch>='0'&&ch<='9') {
			 digCount++;		 
		 }
		 else if(ch>='A'&&ch<='Z') {
			 Alpcount++;
		 
		  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			 VowelCount++;
			 
		 }else {
			 ConsonentCount++;
		 }
	 }
	 }
	 System.out.println("Count of Alphabets: "+Alpcount);
	 System.out.println("Count of dig: "+digCount);
	 System.out.println("Count of vowels: "+VowelCount);
	 System.out.println("Count of cons: "+ConsonentCount);

	 


	 
	 
	}

}
