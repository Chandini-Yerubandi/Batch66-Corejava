package com.java8features;

public class Lamdavsinnerclasses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("Run method called");
				for(int i=0;i<10;i++) {
					System.out.println("run: "+i);				
			}
			
		}
	};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("main: "+i);

}
	}
}
