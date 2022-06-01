package partie4;

public class Animal extends Object{
	int id;
	/*@Override
	public String toString() {
        return "Un nouvel animal";
    }*/

	
	@Override
	 public boolean equals(Object obj) {
		Animal temp = (Animal)obj;
        return (this.id == temp.id);
    }
	
	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return 10;
	}
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.id = 10;
		
		Animal a2 = new Animal();
		a2.id = 10;
		System.out.println(a1);
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		System.out.println(a1.equals(a2));

	}

}
