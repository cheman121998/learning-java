package com.ctmman.managementLibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
 
public class FileAccess {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("E:\\FileAccess.txt"));
            // create book
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Book book = new Book("B01", "Family01", Main.parseDate("02/02/2002"), Status.AVAILABLE);            
            // write book     
            List<Book> books = new ArrayList<Book>();
            oos.writeObject(book);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        } 
        
        ObjectInputStream ois = null;
        
        try {
            ois = new ObjectInputStream(new FileInputStream("E:\\FileAccess.txt"));
            // read 
            Book book = (Book) ois.readObject();
            // show 
            System.out.println(book.toString());
            //List<Book> books = (List<Book>) ois.readObject();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }      
    }
}