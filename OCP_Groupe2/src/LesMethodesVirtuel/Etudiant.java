package LesMethodesVirtuel;

public class Etudiant extends Personne{
	@Override  // m�thode virtuelle
	public void info() {
		System.out.println("Un etudiant");
	}
	
	public void test() {}
	
	
}
