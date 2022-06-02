package app;

public class Provider {
	
	// version Lazy instanciation
	private static  Provider instance=null;
	
	private Provider()
	{
		System.out.println("Construction du Singleton provider");
	}
	
	public static Provider getInstance()
	{
		if(instance == null) {
			System.out.println("Created first time");
			instance = new Provider();
		}
		else {
		  System.out.println("Object déjà crée");
		}
		return instance;
	}
	
	public void test()  // méthode d'instance
	{
		System.out.println("Appel de test sur le singleton");
	}

}
