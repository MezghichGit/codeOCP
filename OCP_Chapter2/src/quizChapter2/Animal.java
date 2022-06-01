package quizChapter2;

public class Animal {
	public void info()
	{
		System.out.println("Animal");
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.info();
		Oiseau o = new Oiseau();
		o.info();

	}

}
