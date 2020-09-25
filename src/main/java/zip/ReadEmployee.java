package zip;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class ReadEmployee {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("db");
		GZIPInputStream gs = new GZIPInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(gs);
		Employee sarah = (Employee) ois.readObject();
		Employee sam = (Employee) ois.readObject();
		// print the records after reconstruction of state
		sarah.print();
		sam.print();
		ois.close();
		fis.close();

	}

}
