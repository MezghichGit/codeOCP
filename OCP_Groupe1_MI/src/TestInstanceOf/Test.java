package TestInstanceOf;

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		Poisson p = new Poisson();
		
		a = o;

		boolean res1 = a instanceof Animal; System.out.println(res1);
		boolean res2 = o instanceof Animal; System.out.println(res2);
		boolean res3 = a instanceof Oiseau; System.out.println(res3);
		
		//boolean res4 = o instanceof Poisson; System.out.println(res4);
		boolean res5 = a instanceof Oiseau; System.out.println(res5);
	}

}
