package app;

public class Lambda {

	public static void main(String[] args) {
		Prediction p1 = (String s, int a)->{return s.length()==3;};
		
		System.out.println(p1.test("Ali", 10));
		
		Prediction p2 = (String s, int b)->{return s.startsWith("e");};
		System.out.println(p2.test("Ali",4));
	}

}
