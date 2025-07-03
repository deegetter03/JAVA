package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // Stream API - introduced in Java 8
        // Stream API is used to process collections of objects
        // Stream API provides a functional approach to processing collections
        // Stream API provides a way to process collections in a declarative, sequential and functional way
		
		List<Integer> numberslist = new ArrayList<>();
		numberslist.add(10);
		numberslist.add(20);
		numberslist.add(30);
		numberslist.add(40);
		
		//LIST
		
		// normal way LISt
//		List<Integer> squarelist = new ArrayList<>();
//		for(Integer i : numberslist) {
//			squarelist.add(i*i);
//		}
		
		//with streams - map method with lambda function syntax
		// after the collect method stream function concludes
		
//		List<Integer> squarelist = numberslist.stream().map(x -> x*x).collect(Collectors.toList());
//		System.out.println("List of squared number: " + squarelist);

		//SET
		
		//without stream
//		Set<Integer> squareset = new HashSet<>();
//		for(Integer i : numberslist) {
//			squareset.add(i*i);
//		}
	
		Set<Integer> squareset = numberslist.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("List of squared number: " + squareset);
	
	}
}