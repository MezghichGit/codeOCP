package app;

public class Crate <T>{  //Une classe g�n�rique
	
	T contenu;
	
	Crate(T t){   // contructeur g�n�rique
		this.contenu = t;
	}
	
	public void info() {
		System.out.println(this.contenu);
	}

}
