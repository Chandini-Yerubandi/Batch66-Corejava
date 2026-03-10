package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaWithCollections {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(30);
		a.add(20);
		System.out.println(a);
		Comparator<Integer> c=(o1,o2)->(o1>o2)?1:(o1<o2)?-1:0;
		Collections.sort(a,c);
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
