package chapter1.cat.species;

import chapter1.cat.BigCat;
/*
    class BigCat{
 	public String name = "cat";
	protected boolean hasFur = true;
	boolean hasPaws = true;
	private int id;
	}
 */
public class Lynx extends BigCat{
	
	
	 public static void main(String[] args) {
		BigCat cat = new BigCat();
		 //Lynx cat = new Lynx();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	} 
	  
	 
	 
	 

}
