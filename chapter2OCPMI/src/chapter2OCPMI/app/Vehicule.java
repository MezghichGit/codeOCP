package chapter2OCPMI.app;

public interface Vehicule {
	
	public static final int MAX_VOLUME=400;
	
	abstract void avancer();
	
	public void sarreter();
	
	public default void info() {
		System.out.println("M�thode concrete de l'interface");
	}
	public static void affichage() {
		System.out.println("M�thode concrete aussi");
	}

}
