package chapter1.overriding;
import java.io.IOException;
public class Animal {

	public Animal info() throws IOException{
		System.out.println("Animal");
		return new Animal();
	}
}
