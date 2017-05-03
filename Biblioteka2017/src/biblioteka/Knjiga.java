package biblioteka;

import java.io.Serializable;
import java.util.LinkedList;

public class Knjiga implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3703480367619355688L;
	
	private String naslov;
	private long isbn;
	private String izdavac;
	private int izdanje;
	private LinkedList<Autor> autori;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		if (naslov == null || naslov.isEmpty())
			throw new RuntimeException("Morate uneti naslov");

		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		if (isbn <= 0)
			throw new RuntimeException("Morate uneti isbn");

		this.isbn = isbn;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		if (izdavac == null || izdavac.isEmpty())
			throw new RuntimeException("Morate uneti izdavaca");
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		if (izdanje <= 0)
			throw new RuntimeException("Morate uneti izdanje");

		this.izdanje = izdanje;
	}
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	public void setAutori(LinkedList<Autor> autori) {
		if (autori == null || autori.isEmpty())
			throw new RuntimeException("Morate uneti bar jednog autora");

		this.autori = autori;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", izdavac=" + izdavac + ", izdanje=" + izdanje
				+ ", autori=" + autori + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (isbn ^ (isbn >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	
	
	

}
