package chapter2OCPMI.app;

public abstract class Animal {
	String espece;
	int age;
	String location;
	public void manger()
	{
		System.out.println("Je veux manger");
	}
	
	public void dormir()
	{
		System.out.println("Je veux dormir");
	}
	
	public abstract void sedeplacer();
	
}
