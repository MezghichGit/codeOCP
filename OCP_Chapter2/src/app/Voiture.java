package app;

import java.io.Serializable;

public class Voiture implements Vehicule, Serializable{

	@Override
	public void affichage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public  void info() {   // m�thode concr�te � partir de Java 8
		System.out.println("Un v�hicule : Voiture");
	}
	

}
