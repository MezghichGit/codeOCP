package app;

public interface Vehicule extends I1,I2 {
	int MAX_SPEED=100;
	
	public default void info() {   // m�thode concr�te � partir de Java 8
		System.out.println("Un v�hicule");
	}
	
    void affichage();  // une m�thode abstraite
	
    
    public static void getMaxSpeed() {  // m�thode concr�te � partir de Java 8
    	System.out.println(MAX_SPEED);
    }
    public default void m() {}
}
