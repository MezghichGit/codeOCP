package chapter4.LesStreams;

public class Animal {
	
	String nom;
	int age;
	double poids;
	public Animal(String nom, int age, double poids ) {
		super();
		this.nom = nom;
		this.age = age;
		this.poids = poids;
	}
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", age=" + age + ", poids=" + poids + "]";
	}

}
