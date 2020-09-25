package zip;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Employee sarah = new Employee("S. Jordan", 28, 56000);
		Employee sam = new Employee("S. McDonald", 29, 58000);
		// serialize the objects sarah and sam
		FileOutputStream fos = new FileOutputStream("db");
		GZIPOutputStream gz = new GZIPOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(gz);
		oos.writeObject(sarah);
		oos.writeObject(sam);
		oos.flush();
		oos.close();
		fos.close();

	}

}
