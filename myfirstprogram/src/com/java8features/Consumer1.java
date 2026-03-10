package com.java8features;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class Consumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c=(s)->System.out.println("Hello: "+s);
		c.accept(101);
		Consumer<String> c1=(s)->System.out.println("Welcome: "+s);

		BiConsumer<String,String> c2=(s1,s2)->System.out.println("Welcome: "+(s1+s2));
		c2.accept("Chandini","Ratna");

	}

}
