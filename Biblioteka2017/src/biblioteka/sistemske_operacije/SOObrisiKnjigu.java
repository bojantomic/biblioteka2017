package biblioteka.sistemske_operacije;

import java.util.LinkedList;

import biblioteka.Knjiga;

public class SOObrisiKnjigu {
	
	public static void izvrsi (Knjiga k, LinkedList<Knjiga> knjige) {
		if (k == null)
			throw new RuntimeException("Null knjiga");
		
		knjige.remove(k);
	}

}
