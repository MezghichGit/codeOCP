package LesInterfacesFonctionneles;

public class Main {

	public static void main(String[] args) {
		Prediction p = ()->{return;};
		
		p.info();
		
		Prediction p1 = ()->{System.out.println("Hi");};
		p1.info();

	}

}
