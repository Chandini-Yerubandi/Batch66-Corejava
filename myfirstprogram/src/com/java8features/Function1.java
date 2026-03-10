package com.java8features;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Function1 {
//function--->apply
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> f3=(i1,i2)->(i1+i2)*2;
		System.out.println(f3.apply(10, 20));

		Function<Integer,Integer> f=(i)->i*2;
		System.out.println(f.apply(2));
		Function<String,Integer> f1=(s)->s.length();
		System.out.println(f1.apply("Chandini"));
		Function<String,String> f2=(s)->s.toUpperCase();
		System.out.println(f2.apply("Chandini"));

	}

}
