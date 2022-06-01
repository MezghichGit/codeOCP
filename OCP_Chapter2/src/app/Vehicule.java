package app;

public interface Vehicule extends I1,I2 {
	int MAX_SPEED=100;
	
	public default void info() {   // méthode concrête à partir de Java 8
		System.out.println("Un véhicule");
	}
	
    void affichage();  // une méthode abstraite
	
    
    public static void getMaxSpeed() {  // méthode concrête à partir de Java 8
    	System.out.println(MAX_SPEED);
    }
    public default void m() {}
}
