package Encapsulation;

public class Animal {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0 && age<100)   
		  
			this.age = age;
		else
			System.out.println("Age invalide");
	}
	

}
