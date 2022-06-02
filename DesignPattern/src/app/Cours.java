package app;

import java.util.ArrayList;
import java.util.List;

public final class Cours {
	
	private final String nomCours;
	@Override
	public String toString() {
		return "Cours [nomCours=" + nomCours + ", charge=" + charge + ", chapitres=" + chapitres + "]";
	}

	private final int charge;
	protected final List<String>chapitres;
	
	public Cours(String nomCours, int charge, List<String> chapitres) {

		this.nomCours = nomCours;
		this.charge = charge;
		this.chapitres = new ArrayList(chapitres);
	}

	public String getNomCours() {
		return nomCours;
	}

	/*public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}*/
	public void changeTitreCours() {
		//this.nomCours = null;
	}
	public int getCharge() {
		return charge;
	}

	/*public void setCharge(int charge) {
		this.charge = charge;
	}*/

	public  List<String> getChapitres() {
		return new ArrayList(chapitres);
	}

	/*public void setChapitres(List<String> chapitres) {
		this.chapitres = chapitres;
	}*/
	


}
