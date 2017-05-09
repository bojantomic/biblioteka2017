package biblioteka.sistemske_operacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import biblioteka.Knjiga;

public class SOSacuvajKnjige {
	
	public static void izvrsi (String filepath, 
			LinkedList<Knjiga> knjige) throws Exception {
		ObjectOutputStream out =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(filepath)));
			
			out.writeObject(knjige);
			
			out.close();
	}

}
