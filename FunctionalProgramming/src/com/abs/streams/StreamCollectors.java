package com.abs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Collectors are used to combine the result of processing on the elements of a stream. 
 * Collectors can be used to return a list or a string.
 * @author Abbas
 *
 */
public class StreamCollectors {
	
	
	public static void main(String[] args) {
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		
		squaresList.forEach(System.out::println);
	
		
		
		numbers.stream().limit(3).forEach(System.out::print);
		System.out.println();
		numbers.stream().limit(5).sorted().forEach(System.out::print);
	
	
		
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		
	

		
	}
	
	

}
