package singleton;

import java.util.ArrayList;

public class TestStudents {

	public static void main(String[] args) {
		
		ArrayList<String> f = new ArrayList<>();
		f.add("fish");
		f.add("meat");
		Student s = new Student(25,"Amine",f);
		f.clear();
		ArrayList<String> f2 = s.getFoods();
		f2.clear();
		System.out.println(s.getFoods());
		
		 
		

	}

}
