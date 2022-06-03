package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	/*
	Stream<String> empty = Stream.empty(); // 
	Stream<Integer> singleElement = Stream.of(1); // 
	Stream<Integer> fromArray = Stream.of(1, 2, 3); // 
	
	long res = singleElement.count();
	System.out.println(res);*/
	/*List<String> list = Arrays.asList("a", "b", "c");
	Stream<String> fromList = list.stream();
	fromList.forEach(System.out::println);*/
		
	//Stream<Double> randoms = Stream.generate(Math::random);
	//randoms.limit(10).forEach(System.out::println);
	
	//Stream<Integer> oddNumbers = Stream.iterate(6, n -> n + 6);
	//oddNumbers.peek(System.out::println).allMatch(n->n+6<50);
    /*
	Stream<Integer> oddNumbers = Stream.empty();
	Optional<Integer> tab = oddNumbers.findFirst();
	if(tab.isPresent()) {
	    System.out.println(tab.get());
	}
	else
		System.out.println("No value yet");*/
		
		
	}
	

}
