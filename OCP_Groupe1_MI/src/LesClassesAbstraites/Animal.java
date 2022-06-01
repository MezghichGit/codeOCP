package LesClassesAbstraites;

public abstract class Animal {
	int age;
	String espece;
	public void manger()
	{
		System.out.println("J'ai faim");
	}
	
	public void dormir()
	{
		System.out.println("Je veux dormir");
	}
	public abstract void seDeplacer();
}
