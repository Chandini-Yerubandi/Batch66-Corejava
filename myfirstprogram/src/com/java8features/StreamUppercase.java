package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("chandini","ratna","durga");
		List<String> uppercase=s.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
//sorted--->.sorted()          count elements--->.count();
	}

}
