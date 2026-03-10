package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapNestedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> nestedlist=Arrays.asList(Arrays.asList("a","b"),
				                                    Arrays.asList("c"),Arrays.asList("d"));
		List<String> normallist=nestedlist.stream().flatMap(List::stream).collect(Collectors.toList());
		//System.out.println(normallist);//prints as list
		normallist.forEach(System.out::println);//prints one by one
		System.out.println("***************************************************");
		List<String> sentences=Arrays.asList("Hello world","Hello welcome");
		List<String> words=sentences.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).collect(Collectors.toList());
		words.forEach(System.out::println);
	}

}
