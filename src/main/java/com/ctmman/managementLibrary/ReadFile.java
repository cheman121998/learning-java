package com.ctmman.managementLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("E:\\FileAccess.txt"));
			// read student
			Book book = (Book) ois.readObject();
			// show student
			System.out.println(book.toString());
			List<Book> books = (List<Book>) ois.readObject();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
