package chapter2OCPMI.app;

public class Car implements Vehicule{

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sarreter() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void info() {
		System.out.println("Méthode concrete de car");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.info();
	}

}
