package app;

import java.util.ArrayList;
import java.util.List;

public class UseCrate {
	
	ArrayList<String>a;
	List<String>ls;
	static <T>  void affichage (T a)
	{
	 System.out.println(a);
	}

	public static void main(String[] args) {
		affichage(12);
		affichage("Hello OCP");
		affichage(true);
		
		
		Crate<String>temp = new Crate("Amine");
		temp.info();
		
		Animal a = new Animal();
		
		Crate<Animal>cAnimal = new Crate(a);
		cAnimal.info();

	}

}
