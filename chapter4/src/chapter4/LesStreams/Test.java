package chapter4.LesStreams;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("black bear", "gggoo","brown bear", "grizzly");
		long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count(); // grizzly
		System.out.println(count); 

	}

}
