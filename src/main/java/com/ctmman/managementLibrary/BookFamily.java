package com.ctmman.managementLibrary;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BookFamily implements Serializable {
	public String title;
	public String author;
	public String id;
	public Date publishDate;
	public String revision;
	public ArrayList<Book> book = new ArrayList<Book>();
	
	public BookFamily(String title, String author, String id, Date publishDate, String revision) {
		this.title = title;
		this.author = author;
		this.id = id;
		this.publishDate = publishDate;
		this.revision = revision;
		this.book = new ArrayList<Book>();
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sach: " + "\t");
		title = sc.next();
		System.out.println("Nhap tac gia: "+ "\t");
		author = sc.next();
		System.out.println("Nhap ma: "+ "\t");		
		id = sc.next();
		System.out.println("Nhap ten sach: "+ "\t");
		//publishDate = sc.next();
		System.out.println("Nhap tac gia: "+ "\t");
		revision = sc.next();			
	}
	
	public void display() {
		System.out.println("Ten sach: " + "\t" + this.title);
		System.out.println("Tac gia: " + "\t" + this.author);
		System.out.println("The loai: " + "\t" + this.id);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Ngay xuat ban: " + "\t" + format.format(this.publishDate));
		System.out.println("Phien ban:" + "\t" + this.revision);
		
		System.out.println("Sach :");
        for(int i = 0; i < this.book.size(); i++){
           System.out.println(this.book.get(i).bookId);
        }      
       
	}	 
}
