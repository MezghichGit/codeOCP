package chapter4.LesStreams;

public class Etudiant {

	String nom;
	double moyenne;
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", moyenne=" + moyenne + "]";
	}
	public Etudiant(String nom, double moyenne) {
		super();
		this.nom = nom;
		this.moyenne = moyenne;
	}
}
