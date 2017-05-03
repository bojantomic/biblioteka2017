package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKnjiguProzor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1018352797613575834L;
	private JPanel contentPane;
	private JLabel lblNaslov;
	private JLabel lblIsbn;
	private JLabel lblIzdavac;
	private JLabel lblIzdanje;
	private JLabel lblAutori;
	private JTextField poljeNaslov;
	private JTextField poljeISBN;
	private JTextField poljeIzdavac;
	private JSpinner spinner;
	private JLabel lblImePrvogAutora;
	private JLabel lblPrezimePrvogAutora;
	private JTextField polje1ime;
	private JTextField polje1prezime;
	private JLabel lblImeDrugogAutora;
	private JTextField polje2ime;
	private JLabel lblPrezimeDrugogAutora;
	private JTextField polje2prezime;
	private JButton btnSacuvaj;
	private JButton btnOdustani;


	/**
	 * Create the frame.
	 */
	public DodajKnjiguProzor() {
		setTitle("Dodaj knjigu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 319, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNaslov());
		contentPane.add(getLblIsbn());
		contentPane.add(getLblIzdavac());
		contentPane.add(getLblIzdanje());
		contentPane.add(getLblAutori());
		contentPane.add(getPoljeNaslov());
		contentPane.add(getPoljeISBN());
		contentPane.add(getPoljeIzdavac());
		contentPane.add(getSpinner());
		contentPane.add(getLblImePrvogAutora());
		contentPane.add(getLblPrezimePrvogAutora());
		contentPane.add(getPolje1ime());
		contentPane.add(getPolje1prezime());
		contentPane.add(getLblImeDrugogAutora());
		contentPane.add(getPolje2ime());
		contentPane.add(getLblPrezimeDrugogAutora());
		contentPane.add(getPolje2prezime());
		contentPane.add(getBtnSacuvaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblNaslov() {
		if (lblNaslov == null) {
			lblNaslov = new JLabel("Naslov:");
			lblNaslov.setBounds(10, 11, 46, 14);
		}
		return lblNaslov;
	}
	private JLabel getLblIsbn() {
		if (lblIsbn == null) {
			lblIsbn = new JLabel("ISBN:");
			lblIsbn.setBounds(10, 36, 46, 14);
		}
		return lblIsbn;
	}
	private JLabel getLblIzdavac() {
		if (lblIzdavac == null) {
			lblIzdavac = new JLabel("Izdavac:");
			lblIzdavac.setBounds(10, 61, 46, 14);
		}
		return lblIzdavac;
	}
	private JLabel getLblIzdanje() {
		if (lblIzdanje == null) {
			lblIzdanje = new JLabel("Izdanje:");
			lblIzdanje.setBounds(10, 86, 46, 14);
		}
		return lblIzdanje;
	}
	private JLabel getLblAutori() {
		if (lblAutori == null) {
			lblAutori = new JLabel("Autori:");
			lblAutori.setBounds(10, 117, 46, 14);
		}
		return lblAutori;
	}
	private JTextField getPoljeNaslov() {
		if (poljeNaslov == null) {
			poljeNaslov = new JTextField();
			poljeNaslov.setBounds(59, 8, 234, 20);
			poljeNaslov.setColumns(10);
		}
		return poljeNaslov;
	}
	private JTextField getPoljeISBN() {
		if (poljeISBN == null) {
			poljeISBN = new JTextField();
			poljeISBN.setColumns(10);
			poljeISBN.setBounds(59, 33, 234, 20);
		}
		return poljeISBN;
	}
	private JTextField getPoljeIzdavac() {
		if (poljeIzdavac == null) {
			poljeIzdavac = new JTextField();
			poljeIzdavac.setColumns(10);
			poljeIzdavac.setBounds(59, 58, 234, 20);
		}
		return poljeIzdavac;
	}
	private JSpinner getSpinner() {
		if (spinner == null) {
			spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
			spinner.setBounds(59, 83, 29, 20);
		}
		return spinner;
	}
	private JLabel getLblImePrvogAutora() {
		if (lblImePrvogAutora == null) {
			lblImePrvogAutora = new JLabel("Ime prvog autora:");
			lblImePrvogAutora.setBounds(20, 145, 88, 14);
		}
		return lblImePrvogAutora;
	}
	private JLabel getLblPrezimePrvogAutora() {
		if (lblPrezimePrvogAutora == null) {
			lblPrezimePrvogAutora = new JLabel("Prezime prvog autora:");
			lblPrezimePrvogAutora.setBounds(132, 145, 124, 14);
		}
		return lblPrezimePrvogAutora;
	}
	private JTextField getPolje1ime() {
		if (polje1ime == null) {
			polje1ime = new JTextField();
			polje1ime.setBounds(22, 166, 86, 20);
			polje1ime.setColumns(10);
		}
		return polje1ime;
	}
	private JTextField getPolje1prezime() {
		if (polje1prezime == null) {
			polje1prezime = new JTextField();
			polje1prezime.setBounds(131, 166, 112, 20);
			polje1prezime.setColumns(10);
		}
		return polje1prezime;
	}
	private JLabel getLblImeDrugogAutora() {
		if (lblImeDrugogAutora == null) {
			lblImeDrugogAutora = new JLabel("Ime drugog autora:");
			lblImeDrugogAutora.setBounds(20, 213, 102, 14);
		}
		return lblImeDrugogAutora;
	}
	private JTextField getPolje2ime() {
		if (polje2ime == null) {
			polje2ime = new JTextField();
			polje2ime.setColumns(10);
			polje2ime.setBounds(22, 234, 86, 20);
		}
		return polje2ime;
	}
	private JLabel getLblPrezimeDrugogAutora() {
		if (lblPrezimeDrugogAutora == null) {
			lblPrezimeDrugogAutora = new JLabel("Prezime drugog autora:");
			lblPrezimeDrugogAutora.setBounds(132, 213, 124, 14);
		}
		return lblPrezimeDrugogAutora;
	}
	private JTextField getPolje2prezime() {
		if (polje2prezime == null) {
			polje2prezime = new JTextField();
			polje2prezime.setColumns(10);
			polje2prezime.setBounds(131, 234, 112, 20);
		}
		return polje2prezime;
	}
	private JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String naslov = poljeNaslov.getText();
					String isbn = poljeISBN.getText();
					String izdavac = poljeIzdavac.getText();
					int izdanje = (Integer)spinner.getValue();
					String ime1 = polje1ime.getText();
					String prezime1 = polje1prezime.getText();
					String ime2 = polje2ime.getText();
					String prezime2 = polje2prezime.getText();
					GUIKontroler.dodajKnjigu(naslov, isbn, izdavac, izdanje, ime1, 
							prezime1, ime2, prezime2);
				}
			});
			btnSacuvaj.setBounds(10, 279, 89, 23);
		}
		return btnSacuvaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(132, 279, 89, 23);
		}
		return btnOdustani;
	}
}
