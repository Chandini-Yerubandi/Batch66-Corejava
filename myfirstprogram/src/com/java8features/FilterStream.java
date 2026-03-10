package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("chandini","Ratna","durga");
		List<String> UpdatedNames=names.stream().filter(s->s.contains("a")).sorted().collect(Collectors.toList());
		Consumer<Double> c=d->{
			System.out.println(d);
			
		};
		UpdatedNames.forEach(System.out::println);
}
}