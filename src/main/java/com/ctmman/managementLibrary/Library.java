package com.ctmman.managementLibrary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class Library implements Serializable {

	List<Book> books = new ArrayList<Book>();	
//	Book book1 = new Book("test1", "test1","test2",Main.parseDate("01/01/2011"),"test2","test2","test2", Main.parseDate("01/01/2021"));
//	Book book2 = new Book("test2", "test2","test2",Main.parseDate("01/01/2011"),"test2","test2","test2", Main.parseDate("01/01/2021"));

	List<BookFamily> families = new ArrayList<BookFamily>();
	List<User> users = new ArrayList<User>();
	List<BorrowActivity> activities = new ArrayList<BorrowActivity>();

	List<User> findViolatedUsers() {
		return null;
	}

	List<User> searchUsers(String text) {
		return null;
	}

	public void borrowBook(String userId, String bookId) {
		books.forEach(book -> {
			if (book.bookId.equals(bookId)) {
				book.borrow();
				BorrowActivity ac = new BorrowActivity(userId, bookId, Calendar.getInstance().getTime(),
						Activity.BORROW);
				activities.add(ac);
			}
		});
	}

	public void returnBook(String userId, String bookId) {
		
	}

	public void addNewBook(BookFamily family) {
		String uniqueID = UUID.randomUUID().toString();
		Book b = new Book(uniqueID, family.id, Main.parseDate("03/01/2001"), Status.AVAILABLE);
		books.add(b);
	}

	public void deleteBook(String bookId) {
		boolean successful = false;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).bookId == bookId) {
				books.remove(i);
				System.out.println("Xoa sach thanh cong");
				successful = true;
			}
		}

		if (!successful) {
			System.out.println("Khong the xoa quyen sach co id " + bookId);
		}
	}

	public void registerUser(User user) {

	}

	public void extendUser(String userId, long duration) {
		
	}

	public void deleteUser(User userId) {
		boolean successful = false;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).userId.equals(userId)) {
				users.remove(i);
				System.out.println("Xoa doc gia thanh cong");
				successful = true;
			}
		}

		if (!successful) {
			System.out.println("Khong the xoa quyen sach co id " + userId);
		}
	}

	public void persistData(String filePath) throws IOException {
		File output = new File("output.txt");
		FileWriter writer = new FileWriter(output);
		writer.write("This text was written with a FileWriter");
		writer.flush();
		writer.close();
	}

	public void loadData(String filePath) {
		String insertData = "LOAD DATA INFILE 'E:/FileAccess.txt '" + " INTO TABLE masterdict"
				+ " FIELDS TERMINATED BY \',\'";
	}
	
	public static Date parseStringToDate(String dateText) throws ParseException {		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		Date date = format.parse(dateText);
		return date;
	}
}
