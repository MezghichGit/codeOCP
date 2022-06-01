package package1;

import java.util.ArrayList;
import static java.util.Collections.*;

public class UtilisationArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(18);
		num.add(2);
		//Collections.sort(num);
		sort(num);
		System.out.println(num);
		

	}

}
