package app;

public class Crate <T>{  //Une classe générique
	
	T contenu;
	
	Crate(T t){   // contructeur générique
		this.contenu = t;
	}
	
	public void info() {
		System.out.println(this.contenu);
	}

}
