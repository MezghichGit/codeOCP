package chapter1.overriding;

import java.io.IOException;

public class Oiseau extends Animal{

	@Override
	public Oiseau info() throws IOException {
		System.out.println("Animal mais un oiseau");
		return new Oiseau();
	}
}
