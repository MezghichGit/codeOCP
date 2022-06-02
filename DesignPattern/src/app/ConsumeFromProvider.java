package app;

public class ConsumeFromProvider {

	public static void main(String[] args) {
		System.out.println("************  Premier Appel  ************");
		Provider p1 = Provider.getInstance();
		System.out.println(p1);
		System.out.println("************  Second Appel  ************");
		Provider p2 = Provider.getInstance();
		System.out.println(p2);
		
		//boolean res = p1.equals(p2);
		//System.out.println(res);

	}

}
