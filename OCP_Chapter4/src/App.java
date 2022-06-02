import java.util.Optional;

public class App {
	
	public static Optional<Double> average(int ... scores ) {
		if (scores.length == 0) return Optional.empty(); 
		int sum = 0;
		for (int score: scores) sum += score;
	return Optional.of((double) sum / scores.length);
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(average(10,12,18).get());
		//System.out.println(average());
		//System.out.println(average().get());
		
		/////Optional<Double> opt = average(10,20);
		
		//opt.ifPresent(System.out::println);
		
		//opt.ifPresent(x->System.out.println(x));
		
		///////opt.ifPresent((Double x)->System.out.println(x));
		
		
		//Optional<Double> opt = average();
		
		/*if (opt.isPresent())
			System.out.println(opt.get()); 
		else
			System.out.println("demain diponible"); */
		
		Optional<Double> opt = average(10);
		//System.out.println(opt.orElse(Double.NaN));
		//System.out.println(opt.orElse(new Double(1000)));
		//System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("Pas de valeur encore"))); 
	}

}
