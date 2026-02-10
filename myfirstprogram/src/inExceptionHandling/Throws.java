package inExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Main Method Started!!");
//		File f=new File("C:\\Users\\yerub\\OneDrive\\b66 ui\\Chandini.txt");
//		f.createNewFile();
		FileReader fr=new FileReader("C:\\Users\\yerub\\OneDrive\\b66 ui\\Chandini.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		

	}

}
