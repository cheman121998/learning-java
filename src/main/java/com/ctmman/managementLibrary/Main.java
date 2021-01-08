package com.ctmman.managementLibrary;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Main {
	public static Date parseDate(String dateText) {
		Date date = new Date();
		try {
			DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
			date = format.parse(dateText);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static void main(String[] args) throws InterruptedException, ParseException {
		Scanner scanner = new Scanner(System.in);
		// Quan ly danh sach
		List<Book> books = new ArrayList<Book>();
		List<User> users = new ArrayList<User>();
		List<BookFamily> bookFamilies = new ArrayList<BookFamily>();
		Book book = new Book("B01", "Family01", Main.parseDate("03/05/2003"), Status.AVAILABLE);
		book.borrow();
		System.out.println(book.borrow());
		User user = new User("Man", "User01", "Man Man", Main.parseDate("01/02/1998"), "01232323", "man@gmail.com",
				Main.parseDate("1/1/2000"), Main.parseDate("10/01/2021"));
		User user1 = new User("Minh", "User02", "Man Man", Main.parseDate("01/02/1998"), "01232323", "man@gmail.com",
				Main.parseDate("1/1/2000"), Main.parseDate("10/01/2021"));
		user.display();
		user1.display();

		BorrowActivity actionBorrow = new BorrowActivity(null, null, null);
		Activity active = Activity.BORROW;
		if (active.equals(active.BORROW)) {
			System.out.println("Sach da duoc muon");
		} else {
			System.out.println("Sach van con");
		}

		int choose;
		Scanner input = new Scanner(System.in);

		do {
			showMenu();
			choose = input.nextInt();
			int n = -1;
			switch (choose) {
			case 1:
				// Nhap thong tin sach
				System.out.println("Nhap so sach can them vao");
				n = input.nextInt();

				for (int i = 0; i < n; i++) {
					Book book1 = new Book();
					book1.input();
					books.add(book1);
				}
				
				System.out.println("List Book: ");
				for(Book b2 : books) {
					System.out.println(b2.toString());
				}
				break;
			case 2:
				// Nhap thong tin doc gia
				System.out.println("Nhap so doc gia can them vao");
				n = Integer.parseInt(input.nextLine());

				for (int i = 0; i < n; i++) {
					User user11 = new User();
					user11.input();
					users.add(user11);
				}
				break;
			case 3:
				for(int i = 0; i < users.size(); i++) {   
				    System.out.print(users.get(i));
				} 
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Nhap id doc gia can xoa");
				
				System.out.println("Xoa doc gia thanh cong!!!");
				break;
			default:
				System.out.println("Nhap lai!");
				break;
			}

		} while (choose != 6);
		scanner.close();
	}

	public static void showMenu() {
		System.out.println("Danh sach hanh dong:");

		System.out.println("1. Them moi sach:");
		System.out.println("2. Them moi doc gia:");
		System.out.println("3. Hien thi danh sach doc gia:");
		System.out.println("4. Hien thi danh sach sach:");
		System.out.println("6. Xoa doc gia:");

		System.out.println("Nhap yeu cau:");
	}

}
