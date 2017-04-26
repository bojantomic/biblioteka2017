package gui.modeli;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import biblioteka.Knjiga;

public class PrikazKnjigaTableModel extends AbstractTableModel{
	private String[] kolone = {"Naslov","ISBN","Izdavac",
			"Izdanje","Prvi autor","Drugi autor"};
	private List<Knjiga> knjige;
	
	public PrikazKnjigaTableModel(List<Knjiga> knjige) {
		if(knjige == null)
			this.knjige = new LinkedList<>();
		else
			this.knjige = knjige;
	}
	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return knjige.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Knjiga k = knjige.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return k.getNaslov();
		case 1:
			return k.getIsbn();
		case 2:
			return k.getIzdavac();
		case 3: 
			return k.getIzdanje();
		case 4:
			if(k.getAutori().size() > 0){
				return k.getAutori().get(0).getIme() 
						+ " " + k.getAutori().get(0).getPrezime(); 
			}
			else {
				return "/";
			}
		case 5:
			if(k.getAutori().size() > 1){
				return k.getAutori().get(1).getIme() 
						+ " " + k.getAutori().get(1).getPrezime();
			}
			else {
				return "/";
			}

		default:
			return "Nepoznato.";
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public void azurirajTabelu(List<Knjiga> knjige){
		this.knjige = knjige;
		fireTableDataChanged();
	}
	
	public Knjiga vratiKnjigu(int index){
		return knjige.get(index);
	}

}
