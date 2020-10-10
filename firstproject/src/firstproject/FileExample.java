package firstproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Ömer Kurt
 *
 *
 */
public class FileExample {
	/**
	 * wir können Bytes in Files schreiben und von dort lesen
	 * 
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[]args) throws FileNotFoundException {
		/**
		 * Der FileOutputStream wird genutzt, um Daten in ein File zu schreiben
		 */
	try {
		
		FileOutputStream os = new FileOutputStream("C:\\Users\\Ömer Kurt\\Documents\\testFile.txt");
		 String someText = "Hallo";
		 byte[] textAsByte = someText.getBytes();
		 os.write(textAsByte);

	}
	catch(FileNotFoundException ex) {
		System.err.println("couldn't open file - fatal");
		System.exit(0); // brutal exception handling
	}
		catch(IOException ex) {
		System.err.println("couldn't write data (fatal)");
		System.exit(0);
	
	}
	InputStream is = null;
	try {
		is = new FileInputStream("C:\\Users\\Ömer Kurt\\Documents\\testFile.txt");
		 byte[] readBuffer = new byte[100];
		 is.read(readBuffer);
	} catch(FileNotFoundException ex) {
		System.err.println("couldn't open file - fatal");
		System.exit(0);
	} catch (IOException e) {
	
		System.err.println("couldn't read data (fatal)");
		System.exit(0);
	}
	

	}}
