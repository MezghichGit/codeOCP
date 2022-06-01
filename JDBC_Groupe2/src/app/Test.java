package app;

public class Test {

	public static void main(String[] args) throws Exception {
		try(Animal a = new Animal())
		{
			System.out.println("Travail avec l'objet a");
		}
		
		System.out.println("Fin du programme");

	}

}
