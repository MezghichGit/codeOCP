package app;

import java.util.function.*;
public class TestPredicate {

	public static void main(String[] args) {
		
		System.out.println("Question 1");
		Predicate<String>p1 = (String ch)->{return ch.contains("oca");} ;
		
		System.out.println(p1.test("formation java oca"));
		System.out.println(p1.test("formation java ocp"));
		
		System.out.println("Question 2");
		Predicate<String>p2 = (String ch)->{return ch.length()==6;} ;
		
		System.out.println(p2.test("formation"));
		System.out.println(p2.test("format"));
		
		//Predicate<Etudiant> pSup = (Etudiant e)->{return e.moyenne>17;};
		Predicate<Etudiant> pSup = e-> e.moyenne>17;
		Etudiant e1 = new Etudiant("Mehdi",18);
		Etudiant e2 = new Etudiant("Ali",4);
		if(pSup.test(e1)==true)
			System.out.println(e1.nom);
		
		if(pSup.test(e2)==true)
			System.out.println(e2.nom);

	}

}
