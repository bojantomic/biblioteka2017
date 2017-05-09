package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaPretrazivanje;
import biblioteka.sistemske_operacije.SOPronadjiKnjigu;
import biblioteka.sistemske_operacije.SOUcitajKnjige;

public class BibliotekaPretrazivanjeImplementacija implements BibliotekaPretrazivanje {

	private LinkedList<Knjiga> knjige = 
			new LinkedList<Knjiga>();

	
	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(naslov, autor, isbn, izdavac, knjige);
	}

	@Override
	public void ucitajKnjige(String filepath) throws Exception {
		knjige = SOUcitajKnjige.izvrsi(filepath);
	}

}
