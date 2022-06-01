package chapter2OCPMI.app;

public class Test {

	public static void infoAnimal(Animal a)
	{
		a.sedeplacer();
	}
	public static void main(String[] args) {
		//Animal an = new Animal(); // car la classe Animal est abstraite
		Animal tab[] = new Animal[4];
	
	Oiseau o = new Oiseau();
	Poisson p = new Poisson();
	Chat c = new Chat();
	tab[0] = o;
	tab[1] = p;
	tab[2] = c;
	tab[3] = new Serpent();
	
	for(Animal temp : tab)
	{
		temp.sedeplacer();
	}
	/*infoAnimal(o);
	infoAnimal(p);
	infoAnimal(c);*/
	}

}
