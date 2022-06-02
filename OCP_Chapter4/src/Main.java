import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		/*
		 * Predicate<String> p1 = String::isEmpty; Predicate<String> p2 = x ->
		 * x.isEmpty(); System.out.println(p1.test(""));
		 * System.out.println(p2.test(""));
		 */

		/*
		 * Map<String, Integer> annuaire = new HashMap<>(); annuaire.put("Amine",
		 * 51363634); annuaire.put("Secours", 198); annuaire.put("Urgence", 51363634);
		 * System.out.println(annuaire);
		 */

		/*
		 * Map<String, Integer> annuaire2 = new TreeMap<>(); annuaire2.put("Urgence",
		 * 197); annuaire2.put("Amine", 51363634); annuaire2.put("Secours", 198);
		 * System.out.println(annuaire2);
		 */
		/*
		 * Map<String, Integer> annuaire2 = new TreeMap<>(); annuaire2.put("Amine",
		 * 197); annuaire2.put("Amine", 51363634); annuaire2.put("Secours", 198);
		 * System.out.println(annuaire2);
		 */

		List<String> names = Arrays.asList("Ali", "Salah", "Safwen", "Ala", "Mohsen", "Ahmed");
		System.out.println(names);
		Stream<String> myStream = names.stream();
		
	 //myStream.filter(x->x.startsWith("A")).limit(6).forEach(System.out::println);
				
		long nbr =myStream.filter(x->x.startsWith("A")).count();
		System.out.println(nbr);
	}

}
