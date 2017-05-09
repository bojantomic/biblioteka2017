package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaPretrazivanje {

	public LinkedList<Knjiga> pronadjiKnjigu(
			String naslov, Autor autor, long isbn, String izdavac);
	
	public void ucitajKnjige(String filepath) throws Exception;
	
	
}
