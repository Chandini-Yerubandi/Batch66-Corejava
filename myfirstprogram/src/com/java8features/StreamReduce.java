package com.java8features;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(3,4,5,6,7);
		int sum=number.stream().filter(s->s%2==0).map(n->n*n).reduce(0, Integer::sum);
		System.out.println(sum);

	}

}
