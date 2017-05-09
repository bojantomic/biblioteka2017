package biblioteka.sistemske_operacije;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public class SOPronadjiKnjigu {
	
	public static LinkedList<Knjiga> izvrsi (String naslov, Autor autor, 
			long isbn, String izdavac, LinkedList<Knjiga> knjige) {
		if (autor == null || isbn == 0 ||
				naslov == null || izdavac == null)
			throw new RuntimeException("Morate uneti sve");
		
		LinkedList<Knjiga> rezultat = 
				new LinkedList<Knjiga>();
		
		for (int i=0;i<knjige.size();i++)
			if (knjige.get(i).getNaslov().contains(naslov))
				rezultat.add(knjige.get(i));
		//javan komentar
		return rezultat;
	}

}
