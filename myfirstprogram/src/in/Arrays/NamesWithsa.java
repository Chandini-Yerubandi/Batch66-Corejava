package in.Arrays;

import java.util.Scanner;

public class NamesWithsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		sc.nextLine();
		String[] names=new String[size];
		System.out.println("Read the names From console: ");
		for(int i=0;i<size;i++) {
			names[i]=sc.nextLine();
			
		}
		for(int i=0;i<size;i++) {
		if(names[i].contains("c")|names[i].startsWith("r")|names[i].endsWith("i")) {//.toLowerCase for C
			System.out.println(names[i]);
		}
		}

	}

}
