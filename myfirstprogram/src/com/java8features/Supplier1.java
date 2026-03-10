package com.java8features;
import java.util.Date;
import java.util.function.Supplier;
public class Supplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		Supplier<String>s1=()->{
			String otp=" ";
			for(int i=1;i<=6;i++) {
				otp=otp+(int)(Math.random() *10);
			}
			return otp;
		};
		System.out.println(s1.get());

	}

}
