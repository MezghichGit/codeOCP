import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LesStream {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Yousri","Firas","Hiba","Ayoub","Khouloud","Tarek","Fakher","Amine");

		Stream<String> s = names.stream();
		s.filter(x->x.length()>5).filter(x->x.startsWith("K")).forEach(System.out::println);
		//long v=s.filter(x->x.length()>5).peek(System.out::println).count();
		//System.out.println("Nombre total = "+v);
		//long v = s.count();
	}

}
