package com.ctmman.managementLibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("E:\\FileAccess.txt"));
			// write book
			List<Book> books = new ArrayList<Book>();
			oos.writeObject(books);
			System.out.println("Success...");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			oos.close();
		}
	}
}
