package package1;

import java.io.IOException;

public class Etudiant extends Personne{
	@Override
	public Etudiant getPersonne() throws IOException
	{
		//return new Personne();
		return new Etudiant();
	}
}
