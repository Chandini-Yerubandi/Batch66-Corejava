package inExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class WithoutThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started!!");
//		File f=new File("C:\\Users\\yerub\\OneDrive\\b66 ui\\Chandini.txt");
//		f.createNewFile();
		try {
			FileReader fr = new FileReader("C:\\Users\\yerub\\OneDrive\\b66 ui\\Chandini.txt");

			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();

			}
		} catch (IOException i) {
			i.printStackTrace();
		}
			}

}
