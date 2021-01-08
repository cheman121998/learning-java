package com.ctmman.managementLibrary;

import java.io.IOException;

public class ObjectInputStream {
	 public static void main(String[] args) throws IOException {
	        ObjectInputStream ois = null;
	 
	        try {
	            ois = new ObjectInputStream();
	            // read student
	            Book book = (Book) ois.readObject();
	            // show student
	            System.out.println(book.toString());
	        } finally {
	            ois.close();
	        }
	    }

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private Book readObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
