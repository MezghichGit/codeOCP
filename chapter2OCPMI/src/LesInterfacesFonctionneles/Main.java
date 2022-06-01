package LesInterfacesFonctionneles;

public class Main {

	public static void main(String[] args) {
		/*Prediction p = ()->{return;};
		
		p.info();
		
		Prediction p1 = ()->{System.out.println("Hi");};
		p1.info();*/
		Filter f1 = (String s )->{return s.startsWith("oc");};
		
		Filter f2 = s ->s.endsWith("java");
		
		System.out.println(f1.test("oca"));
		System.out.println(f2.test("formation java"));
		
		Filter f3 = s ->s.length()>6;
		System.out.println(f3.test("java"));

	}

}
