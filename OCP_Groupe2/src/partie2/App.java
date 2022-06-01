package partie2;

public class App extends Object{

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		//Object obj = o;
		Object obj = null;
		
		boolean res = o instanceof Animal; System.out.println(res);
		boolean res2 = obj instanceof Animal; System.out.println(res2);
		
		boolean res3 = a instanceof Oiseau; System.out.println(res3);
		
		Poisson p = new Poisson();
		
		//boolean res4 = p instanceof Oiseau; System.out.println(res4);
		Voiture v = new Voiture();
		boolean res5 = v instanceof Vehicule; System.out.println(res5);
		Moto m = new Moto();
		boolean res6 = m instanceof Vehicule; System.out.println(res6);
	}

}
