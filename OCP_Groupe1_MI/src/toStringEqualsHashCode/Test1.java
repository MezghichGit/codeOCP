package toStringEqualsHashCode;

public class Test1 {

	public static void main(String[] args) {
		Animal a = new Animal(10,"OO");
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		
		Animal a2 = new Animal(10,"OO");
		System.out.println(a == a2);
		System.out.println(a.equals(a2));

	}

}
