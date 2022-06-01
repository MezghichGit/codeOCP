package singleton;

import java.util.ArrayList;

public final class Student {
	
	private  int age=0;
	private  String nom;
	
	private ArrayList<String> foods;
	//= new ArrayList<>();
	public ArrayList<String> getFoods() {
		return new ArrayList<>(foods);
	}
	public Student(int age, String nom,ArrayList<String> repas)
	{
		this.age = age;
		this.nom = nom;
		this.foods = new ArrayList<>(repas);
		//foods.add("meat");
		//foods.add("fish");
	}
	public int getAge() {
		return age;
	}
	public String getNom() {
		return nom;
	}
	
	

}
