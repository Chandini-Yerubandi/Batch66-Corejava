package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> salary=Arrays.asList(2000000.00,3000000.00,2000000.00,4000000.00);
		List<Double> UpdatedSalary=salary.stream().map(s->s+300000).sorted().distinct().collect(Collectors.toList());
		UpdatedSalary.forEach(System.out::println);
	}

}
