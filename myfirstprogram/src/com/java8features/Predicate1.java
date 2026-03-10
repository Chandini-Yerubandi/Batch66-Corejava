package com.java8features;

import java.util.function.Predicate;
import java.util.function.BiPredicate;


public class Predicate1 {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> bp=(i1,i2)->(i1*i2)%2==0;
		System.out.println(bp.test(10, 12));

//wap to find the given number is even or not
		Predicate<String> p2=(s)->s.contains("ant");
		System.out.println(p2.test("Srikanth"));
		Predicate<Integer> p=(i)->i%2==0;
		System.out.println(p.test(9));
//wap to find given num is prime or not..?
		Predicate<Integer>p1=( n)-> {
			boolean status=true;
			if(n==0||n==1) {
				return false;
			}
			for(int i=2;i<n;i++) {
				
				
					if(n%i==0) {
						status=false;
						break;
					}
				}
				
			
		
			return status;
		

	};
	System.out.println(p1.test(3));

	System.out.println(p1.test(6));
	System.out.println(p1.test(5));



}
}
