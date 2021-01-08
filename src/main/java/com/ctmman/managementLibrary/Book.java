package com.ctmman.managementLibrary;

import java.io.Serializable;
import java.rmi.server.UID;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Book implements Serializable {
	
	public String bookId;
	public String familyId;
	public Date dueDate;	
	public Status status;
	
	public Book() {
		
	}
	
	public Book(String bookId, String familyId, Date dueDate, Status status) {
		this.bookId = bookId;
		this.familyId = familyId;
		this.dueDate = dueDate;
		this.status = status;
	}
	
	
	public void input() throws ParseException {
		Scanner sc = new Scanner(System.in);
		bookId = UUID.randomUUID().toString();
		System.out.println("Nhap ma sach: ");
		familyId = sc.nextLine();
		System.out.println("Nhap ngay gia han: ");
		dueDate = Main.parseDate(sc.nextLine());
	}
	
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", familyId=" + familyId + ", dueDate=" + dueDate + ", status=" + status
				+ "]";
	}

	public boolean borrow() {
		if(Status.NOTAVAILABLE.equals(this.status)) {
			return false;
		}else {
			this.status = Status.NOTAVAILABLE;
			Calendar today = Calendar.getInstance();
			today.add(Calendar.DATE, 7);
			this.dueDate = today.getTime();
			return true;
		}
	}
		
}

enum Status { NOTAVAILABLE, AVAILABLE};