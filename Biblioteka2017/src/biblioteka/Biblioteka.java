package biblioteka;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		//javan komentar
		return rezultat;
	}
	
	@Override
	public void ucitajKnjige(String filepath) throws Exception {
		ObjectInputStream in =
			new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(filepath)));
		
		knjige = (LinkedList<Knjiga>)(in.readObject());
		
		in.close();
	}
	
	@Override
	public void sacuvajKnjige(String filepath) throws Exception {
		ObjectOutputStream out =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(filepath)));
			
			out.writeObject(knjige);
			
			out.close();
	}

}
