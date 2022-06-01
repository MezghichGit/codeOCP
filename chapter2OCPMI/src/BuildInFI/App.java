package BuildInFI;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {
		Predicate <String> ps =  ch->{return ch.length()>6;};
		System.out.println(ps.test("ocaspring"));
		BiPredicate<String,String> bc =(phrase,  word)-> phrase.contains(word);
		String ch = "Hello OCA OCP Spring";
		
		System.out.println(bc.test(ch, "OCC"));
		Predicate <Integer> pi;
		Consumer<String> c =(String s)->System.out.println(s.length());
		c.accept("Centrale");
		Supplier <Integer[]>s = ()->new Integer[] {10,2,4,3};
		
		Supplier<StringBuilder> sb = ()->new StringBuilder("OCP");
		
		Integer[]tab = s.get();
		
		Supplier<LocalDate> sdate = ()->LocalDate.now();
		System.out.println(sdate.get());

	}

}
