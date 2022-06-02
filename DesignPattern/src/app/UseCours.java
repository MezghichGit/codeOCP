package app;

import java.util.*;
import java.util.function.Consumer;

public class UseCours {

	public static void main(String[] args) {
		Consumer<String> c =(String s)->{
			//return;
			System.out.println();			
			};
		
		List<String>chapitres = new ArrayList<>();
		chapitres.add("Basic Types");
		chapitres.add("Polymorphism");
		chapitres.add("Functionnal Programming");
		chapitres.add("JDBC");
		Cours c1 = new Cours("Java",60,chapitres);
		
		System.out.println(c1);
		List<String>chapters=c1.getChapitres();
		//chapters.clear();
		//c1.charge = 40;
		chapitres.clear();
		System.out.println(c1);

	}

}
