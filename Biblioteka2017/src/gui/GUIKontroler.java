package gui;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;
import biblioteka.interfejs.BibliotekaInterfejs;

public class GUIKontroler {
	
	private static GlavniProzor glavniProzor;
	private static BibliotekaInterfejs biblioteka;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biblioteka = new Biblioteka();
					glavniProzor = new GlavniProzor();
					glavniProzor.setVisible(true);
					glavniProzor.setLocationRelativeTo(null);
					glavniProzor.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							ugasiAplikaciju();
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void otvoriDodajKnjiguProzor(){
		DodajKnjiguProzor dodajKnjigu = new DodajKnjiguProzor();
		dodajKnjigu.setVisible(true);
		dodajKnjigu.setLocationRelativeTo(glavniProzor);
	}
	public static void ugasiAplikaciju(){
		int odgovor = JOptionPane.showConfirmDialog(glavniProzor, "Da li zelite da zatvorite aplikaciju?", "Zatvaranje", JOptionPane.YES_NO_OPTION);
		if(odgovor == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	public static String izaberiFajl(){
		String fajl = "";
		try {
			JFileChooser fc = new JFileChooser();
			int odgovor = fc.showOpenDialog(glavniProzor);
			if(odgovor == JFileChooser.APPROVE_OPTION){
				File file = fc.getSelectedFile();
				fajl = file.getAbsolutePath();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(glavniProzor, e.getMessage(), "Greska",
			JOptionPane.ERROR_MESSAGE);
		}
		
		return fajl;
		
	}
	
	public static void dodajKnjigu(String naslov, String isbn, String izdavac,
			int izdanje, String ime1, String prezime1, String ime2, String prezime2){
		try {
			Knjiga k = new Knjiga();
			k.setNaslov(naslov);
			k.setIsbn(Long.parseLong(isbn));
			k.setIzdavac(izdavac);
			k.setIzdanje(izdanje);
			LinkedList<Autor> autori = new LinkedList<>();
			Autor a1 = new Autor();
			a1.setIme(ime1);
			a1.setPrezime(prezime1);
			Autor a2 = new Autor();
			a2.setIme(ime2);
			a2.setPrezime(prezime2);
			autori.add(a1);
			autori.add(a2);
			k.setAutori(autori);
			biblioteka.dodajKnjigu(k);	
			glavniProzor.azurirajTabelu();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Greska u cuvanju knjige!",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	public static List<Knjiga> vratiSveKnjige(){
		return biblioteka.vratiSveKnjige();
	}
	
	public static void obrisiKnjigu(Knjiga k){
		biblioteka.obrisiKnjigu(k);
		glavniProzor.azurirajTabelu();
	}
}
