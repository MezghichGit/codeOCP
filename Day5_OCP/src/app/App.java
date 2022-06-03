package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		//System.out.println(pred.test("chimp"));
		//System.out.println(pred.test("2"));
		
		///System.out.println(list.stream().anyMatch(pred)); // true
		///System.out.println(list.stream().allMatch(pred)); // false
		///System.out.println(list.stream().noneMatch(pred)); // false
		//System.out.println(infinite.anyMatch(pred)); // true 
		
		/////Stream<String> infinite = Stream.generate(() -> "chimp");
		//infinite.forEach(System.out::println);
		//System.out.println(infinite.anyMatch(pred));
		///System.out.println(infinite.allMatch(pred));
		///System.out.println("Fin du programme");
		
		//Stream<Integer> stream = Stream.of(3, 5, 6);
		//System.out.println(stream.reduce(0, (a, b) -> a+b));
		
		//Stream<String> stream = Stream.of("ab", "cb", "ab");
		//System.out.println(stream.reduce("", (a, b) -> a+b).length());
		
		/*Stream<String> stream = Stream.of("w", "o", "l", "f");
		List<String> l = stream.collect(Collectors.toList());
		System.out.println(l);*/
		
		/*Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		//s.map(String::length).forEach(System.out::print);
		
		System.out.println( s.map(String::length).reduce(0,(a,b)->a+b));*/
		
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		
		//animals.flatMap(l -> l.stream()).forEach(System.out::println);
		//animals.forEach(System.out::println);
		//animals.flatMap(l -> l.stream()).forEach(System.out::println);
		List<String> ls = animals.flatMap(l -> l.stream()).collect(Collectors.toList());
		System.out.println(ls);
		
	}

}
