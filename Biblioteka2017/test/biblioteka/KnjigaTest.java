package biblioteka;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KnjigaTest {
	
	private Knjiga k;
	
	@Before
	public void setUp() throws Exception {
		k = new Knjiga();
	}

	@After
	public void tearDown() throws Exception {
		k = null;
	}

	@Test
	public void testSetNaslov() {
		k.setNaslov("Tihi don");
		
		assertEquals("Tihi don", k.getNaslov());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNaslovNULL() {
		k.setNaslov(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNaslovPrazanString() {
		k.setNaslov("");
	}

	@Test
	public void testSetIsbn() {
		k.setIsbn(123456789);
		
		assertEquals(123456789, k.getIsbn());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnNula() {
		k.setIsbn(0);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnNegativan() {
		k.setIsbn(-1);
	}

	@Test
	public void testSetIzdavac() {
		k.setIzdavac("Laguna");
		
		assertEquals("Laguna", k.getIzdavac());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdavacNull() {
		k.setIzdavac(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdavacPrazanString() {
		k.setIzdavac("");
	}

	@Test
	public void testSetIzdanje() {
		k.setIzdanje(1);
		
		assertEquals(1, k.getIzdanje());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdanjeNula() {
		k.setIzdanje(0);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdanjeNegativno() {
		k.setIzdanje(-1);
	}

	@Test
	public void testSetAutori() {
		Autor a = new Autor();
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor b = new Autor();
		b.setIme("Mika");
		b.setPrezime("Mikic");
		
		LinkedList<Autor> autori = new LinkedList<Autor>();
		
		autori.add(a);
		autori.add(b);
		
		k.setAutori(autori);
		
		assertEquals(autori, k.getAutori());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetAutoriNull() {
		k.setAutori(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetAutoriPraznaLista() {
		k.setAutori(new LinkedList<Autor>());
	}

}
