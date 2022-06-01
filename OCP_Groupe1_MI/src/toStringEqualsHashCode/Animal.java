package toStringEqualsHashCode;

public class Animal {

	String nom;
	int age;
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", age=" + age + "]";
	}
	public Animal(int age, String nom) {
		this.age = age;
		this.nom = nom;
	}
	
	@Override
	 public boolean equals(Object obj) {
		
		Animal temp = (Animal)obj;
	    return (this.age == temp.age) && (this.nom.equals(temp.nom));
	    }
}
