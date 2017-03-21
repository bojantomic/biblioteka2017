package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = 
			new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		if (k == null)
			throw new RuntimeException("Null knjiga");
		
		knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if (k == null)
			throw new RuntimeException("Null knjiga");
		
		knjige.remove(k);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		if (autor == null || isbn == 0 ||
				naslov == null || izdavac == null)
			throw new RuntimeException("Morate uneti sve");
		
		LinkedList<Knjiga> rezultat = 
				new LinkedList<Knjiga>();
		
		for (int i=0;i<knjige.size();i++)
			if (knjige.get(i).getNaslov().contains(naslov))
				rezultat.add(knjige.get(i));
		
		return rezultat;
	}

}
