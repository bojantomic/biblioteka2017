package gui;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUIKontroler {
	private static GlavniProzor glavniProzor;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	
}
