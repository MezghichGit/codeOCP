package chapter3.app;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String args[]) {
		List <String>names = new ArrayList<>();
		names.add("oca");
		names.add("ocp");
		names.add("10");
		names.add("spring");
		
		System.out.println(names);
		for(Object o : names)
		{
			String temp = (String) o;
			System.out.println(temp.toUpperCase());
		}

	}
}
