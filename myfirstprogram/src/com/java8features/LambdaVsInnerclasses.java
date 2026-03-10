package com.java8features;
interface In8{
	void hello();
	//void hi();
	default void method5() {
		System.out.println("Default metod called!");
	}
}

public class LambdaVsInnerclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In8 i= () -> {//anonymous inner class which implements interface
			System.out.println("Hello method called through lambda expression");
			
		};
		In8 i1=new In8() {

			@Override
			public void hello() {
				System.out.println("Hello");
			}

//			@Override
//			public void hi() {
//				System.out.println("Hi");
//			}
			
		};
		i.hello();
		i1.hello();
		i.method5();
		i1.method5();
	}

}
