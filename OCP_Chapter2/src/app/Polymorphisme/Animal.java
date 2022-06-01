package app.Polymorphisme;

public class Animal {

	
	
	
	
	
	//Méthode polymorphe
	public static void infoAnimal(Animal a)
	{
		
	}
	public static void main(String args[])
	{
		infoAnimal(new Oiseau());
		infoAnimal(new Poisson());
		infoAnimal(new Chien());
		
		//Tableau Polymorphe
		
		Animal tab[] = new Animal[3];
		tab[0]= new Oiseau();
		tab[1]= new Chien();
		tab[2]= new Poisson();
		
		//UpCasting
		/*Oiseau o = new Oiseau();
		
		Animal a = o;*/
		
		//DownCasting
		
		Oiseau o2 = new Oiseau();
		Animal a = new Animal();
		a = o2;//Upcasting
		Oiseau o = (Oiseau)a;  //DownCasting
		
	}
}
