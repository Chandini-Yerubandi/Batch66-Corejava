package com.java8features;
import java.util.function.Function;
public class FunctionChaining {
//andThen    Compose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>f=(i)->i*i*i;
		Function<Integer,Integer>f1=(i)->i*8;
		Function<Integer,Integer>f2=f.andThen(f1);
		System.out.println(f2.apply(2));
		Function<Integer,Integer>f3=f.compose(f1);
		System.out.println(f3.apply(2));



		

	}

}
