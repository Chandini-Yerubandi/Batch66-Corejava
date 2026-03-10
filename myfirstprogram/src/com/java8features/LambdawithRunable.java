package com.java8features;

public class LambdawithRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			System.out.println("Run metgod called");
			for(int i=0;i<10;i++) {
				System.out.println("run: "+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main: "+i);
		}

	}

}
