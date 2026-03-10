package com.java8features;
@FunctionalInterface
//lambda without argument
interface In1{
	public abstract void method1();//abstract method
	public default void method2() {//default method
		System.out.println("Method2 called");
	}
}

	
	

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		In1 i1=()-> {//lambda method
			System.out.println("Method1 implemented successfully");//no method name no class no access modifier just onlt-> arrow called lambda function
			
		};
		i1.method1();

	}
}


