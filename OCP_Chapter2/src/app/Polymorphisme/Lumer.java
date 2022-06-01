package app.Polymorphisme;

public class Lumer extends Primate implements HasTail {
	int age = 10;

	@Override
	public boolean isTailStripped() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String args[])
	{
		Lumer lumer = new Lumer();
		System.out.println(lumer.age);
		lumer.age = 10;
		lumer.isTailStripped();
		lumer.hasHair();
		HasTail hasTail = lumer;  //UpCasting
		hasTail.isTailStripped();
	}

}
