package biblioteka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutorTest {
	
	private Autor a;

	@Before
	public void setUp() throws Exception {
		a = new Autor();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetIme() {
		a.setIme("Pera");
		
		assertEquals("Pera", a.getIme());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		a.setIme(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImePrazanString() {
		a.setIme("");
	}

	@Test
	public void testSetPrezime() {
		a.setPrezime("Peric");
		
		assertEquals("Peric", a.getPrezime());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		a.setPrezime(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimePrazanString() {
		a.setPrezime("");
	}
	
	@Test
	public void testToString() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		assertEquals("Autor [ime=Pera, prezime=Peric]", a.toString());
	}
	
	@Test
	public void testEqualsTrue() {
		a.setIme("Mika");
		a.setPrezime("Mikic");
		
		Autor b = new Autor();
		b.setIme("Mika");
		b.setPrezime("Mikic");
		
		assertTrue(a.equals(b));
	}
	
	@Test
	public void testEqualsFalse() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor b = new Autor();
		b.setIme("Mika");
		b.setPrezime("Mikic");
		
		assertFalse(a.equals(b));
	}

}
