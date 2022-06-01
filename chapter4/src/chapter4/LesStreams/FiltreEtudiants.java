package chapter4.LesStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FiltreEtudiants {

	public static void main(String[] args) {
		List<Etudiant> le = Arrays.asList(
				new Etudiant("Amine",14),
				new Etudiant("Samia",18),
				new Etudiant("Mehdi",17),
				new Etudiant("Safouen",15),
				new Etudiant("Achref",19),
				new Etudiant("Alaa",16),
				new Etudiant("Marouen",17.5),
				new Etudiant("Bassem",18)
				);
		
		System.out.println(le);
		Stream<Etudiant> se = le.stream();
		Predicate<Etudiant> test = (Etudiant e)->{return e.moyenne>16;};
		//se.filter(test).limit(6).forEach(System.out::println);
		
		long res = se.filter(test).peek(System.out::println).count();
		System.out.println("res = "+res);
		
		//
		/*
		Arrays.asList(
				new Etudiant("Amine",14),
				new Etudiant("Samia",18),
				new Etudiant("Mehdi",17),
				new Etudiant("Safouen",15),
				new Etudiant("Achref",19),
				new Etudiant("Alaa",16),
				new Etudiant("Marouen",17.5),
				new Etudiant("Bassem",18)
				).stream().filter(e->e.moyenne>16).imit(2).forEach(e->System.out.println(e));*/

	}

}
