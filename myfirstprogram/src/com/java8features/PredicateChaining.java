package com.java8features;
import java.util.function.Predicate;
public class PredicateChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p1=(i1)->i1%2==0;
		Predicate<Integer>p2=(i2)->i2%3==0;
		Predicate<Integer>p3=p1.and(p2);    //and or negate
		Predicate<Integer>p4=p1.or(p2);

		System.out.println(p3.test(4));
		System.out.println(p4.test(4));




	}

}
