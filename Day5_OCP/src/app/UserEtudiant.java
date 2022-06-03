package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class UserEtudiant {

	public static void main(String[] args) {
		
		Etudiant e1 = new Etudiant("Yousri",44,18);
		Etudiant e2 = new Etudiant("Firas",29,17);
		Etudiant e3 = new Etudiant("Amine",36,17.5);
		Etudiant e4 = new Etudiant("Hiba",25,16.5);
		
		List<Etudiant> students = Arrays.asList(e1,e2,e3,e4);
		/*
		System.out.println(" ##################### Partie List ##################### ");
		
		System.out.println(" *********************** Avant Tri *********************** ");
		students.forEach(System.out::println);
		
		
		System.out.println(" *********************** Après Tri croissant sur l'age *********************** ");
		Comparator<Etudiant> cAge = (Etudiant a, Etudiant b)->a.getAge()-b.getAge();
		Collections.sort(students,cAge);
		students.forEach(System.out::println);
		
		System.out.println(" *********************** Après Tri decroissant sur la moyenne *********************** ");
		
		Comparator<Etudiant> cMoy = (Etudiant a, Etudiant b)->
						{
							int res=-1000;
							
							if(b.getMoy()-a.getMoy()==0) res = 0;
							else if(b.getMoy()-a.getMoy()<0) res = -1;
							else res = 1;
							return res;
						};
		Collections.sort(students,cMoy);
		students.forEach(System.out::println);
		*/
		System.out.println(" ##################### Partie Stream ##################### ");
		
		Comparator<Etudiant> cMinMoy = (Etudiant a, Etudiant b)->
		{
			int res=-1000;
			
			if(b.getMoy()-a.getMoy()==0) res = 0;
			else if(a.getMoy()-b.getMoy()<0) res = -1;
			else res = 1;
			return res;
		};
		
		
		Comparator<Etudiant> cMaxMoy = (Etudiant a, Etudiant b)->
		{
			int res=-1000;
			
			if(b.getMoy()-a.getMoy()==0) res = 0;
			else if(b.getMoy()-a.getMoy()<0) res = -1;
			else res = 1;
			return res;
		};
		
		Stream<Etudiant> stream1 = students.stream();
		Optional<Etudiant> minMoy = stream1.min(cMinMoy);
		
		Stream<Etudiant> stream2 = students.stream();
		Optional<Etudiant> maxMoy = stream2.min(cMaxMoy);
		
		if(minMoy.isPresent())
			System.out.println(minMoy.get());
		else
			System.out.println("Liste vide, pas encore d'étudiants!");
		
		if(maxMoy.isPresent())
			System.out.println(maxMoy.get());
		else
			System.out.println("Liste vide, pas encore d'étudiants!");

	}

}
