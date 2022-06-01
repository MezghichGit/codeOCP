package chapter4.LesStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {

	
	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {
		//System.out.println(average(90, 100)); // Optional[95.0]
		//System.out.println(average()); // Optional.empty 
		
		//Optional<Double> opt = average(90, 100); 
		/*
		Optional<Double> opt = average(); 
		if (opt.isPresent())
			System.out.println(opt.get()); // 95.0 
		else
			System.out.println("No value available");
			*/
		/*
		Optional<Double> opt = average();
		//Optional<Double> opt = average(90, 100);
		opt.ifPresent(System.out::println);*/
		
		/*Optional<Double> opt = average();
		System.out.println(opt.orElse(12.5));
		System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException())); */
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream(); //stream() : méthode de création d'un Stream
		//long nbre = fromList.count(); // count() : méthode terminale
		
		//System.out.println(nbre);
		//long nbre2 = fromList.count(); 
		/*
		Consumer<String> c = (String s)->System.out.println(s);
		fromList.forEach(c);
		
		List<Animal>la = Arrays.asList(
				new Animal("Oiseau",1),
				new Animal("Chien",4),
				new Animal("Chat",3),
				new Animal("Poisson",2)
				);
		
		System.out.println(la);
		Stream<Animal> animals = la.stream();
		System.out.println(animals);
		animals.forEach((Animal a)->System.out.println(a));*/
		
		// Stream infinie
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		//Stream<Double> randoms = Stream.generate(Math::random);
		//randoms.forEach(System.out::println);
		//oddNumbers.limit(6).forEach(System.out::println);
		
		//oddNumbers.forEach(System.out::println);
		
		//Optional<Integer> val = oddNumbers.findAny();
		//System.out.println(val.get());
		
		
		List<Animal>la = Arrays.asList(
				new Animal("Oiseau",10,0.5),
				new Animal("Chie",4,6),
				new Animal("Chat",3,3),
				new Animal("Poisson",2,1)
				);
		
		Predicate<Animal> minNom = (Animal a)->{return a.nom.length()==4;};
		Stream<Animal> animals = la.stream();
		
		animals.filter(minNom).forEach(System.out::println);
		
		
		//Comparator<Animal> c_poids = (Animal a1, Animal a2)->{return (int)(a1.poids-a2.poids);};
		//Comparator<Animal> c_age = (Animal a1, Animal a2)->{return (int)(a1.age-a2.age);};
		//Comparator<Animal> c_min_nom = (Animal a1, Animal a2)->{return (int)(a1.nom.length()-a2.nom.length());};
		//Optional<Animal> minPoidsAnimal = animals.min(c_poids);
		//Optional<Animal> minPoidsAnimal = animals.min(c_age);
		//Optional<Animal> minPoidsAnimal = animals.min(c_min_nom);
		//System.out.println(minPoidsAnimal.get());
	}

}
