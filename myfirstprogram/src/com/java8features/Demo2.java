package com.java8features;
//lambda with argument---->no need to method name arg,class,returntype then we have only one argument
@FunctionalInterface
interface In{
	void hello(String s);
}

	

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In i3=(String s) ->{
//			System.out.println("Hello "+s);		
//				};
		In i3=s->System.out.println("Hello "+s);
		i3.hello("Chandini");
	}

}
