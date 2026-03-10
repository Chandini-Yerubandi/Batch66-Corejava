package com.java8features;
//lambda for 2 arguments--->for return type we must need curly brackets
@FunctionalInterface
interface In3{
	int mul(int a,int b);
}

	 

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In3 i3=(int a,int b)-> a*b;
			
		
		System.out.println(i3.mul(10,20));

	}

}
