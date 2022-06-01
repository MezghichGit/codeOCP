package LesEnums;

public enum Jour {
	LUNDI(20), MARDI(25), MERCREDI(50), JEUDI(70), VENDREDI(30), SAMEDI(100), DIMANCHE(1000);
	private int nb;
	private Jour(int nb) {
		System.out.println("Enum Jour");
		this.nb = nb;
	}
	
	public void getNb()
	{
		System.out.println("Nbre = "+nb);
	}
}
