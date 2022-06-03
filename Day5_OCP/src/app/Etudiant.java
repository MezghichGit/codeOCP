package app;

public class Etudiant {

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoy() {
		return moy;
	}
	public void setMoy(double moy) {
		this.moy = moy;
	}
	private String nom;
	private int age;
	private double moy;
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", moy=" + moy + "]";
	}
	public Etudiant(String nom, int age, double moy) {
		super();
		this.nom = nom;
		this.age = age;
		this.moy = moy;
	}
}
