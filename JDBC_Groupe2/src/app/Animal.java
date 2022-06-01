package app;

public class Animal implements AutoCloseable{

	public Animal()
	{
		System.out.println("Constructeur");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Objet fermé");
		
	}

}
