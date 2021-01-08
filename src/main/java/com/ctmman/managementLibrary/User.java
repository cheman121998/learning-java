package com.ctmman.managementLibrary;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class User implements Serializable {
	public String username;
	public String userId;
	public String fullName;
	public Date birth;
	public String phone;
	public String email;
	public Date registerDate;
	public Date expirationDate;	

	public User() {
		
	}

	public User(String username, String userId, String fullName, Date birth, String phone, String email,
			Date registerDate, Date expirationDate) {
		this.username = username;
		this.userId = userId;
		this.fullName = fullName;
		this.birth = birth;
		this.phone = phone;
		this.email = email;
		this.registerDate = registerDate;
		this.expirationDate = expirationDate;
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten nguoi dung: ");
		username = sc.next();
		System.out.println("Nhap ma doc gia: ");
		userId = sc.next();
		System.out.println("Nhap ho ten: ");
		fullName = sc.next();
		System.out.println("Nhap so dien thoai: ");
		phone = sc.next();
		System.out.println("Nhap email: ");
		email = sc.next();		
	}
	
	public void display() {
//		System.out.println("Ten doc gia: " + "\t" + this.username);
//		System.out.println("Ma doc gia: " + "\t" + this.userId);
//		System.out.println("Ho ten: " + "\t" + this.fullName);
//		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//		System.out.println("Ngay sinh: " + "\t" + format.format(this.birth));
//		System.out.println("So dien thoai:" + "\t" + this.phone);
//		System.out.println("Email:" + "\t" + this.email);		
//		System.out.println("Ngay dang ky: " + "\t" + format.format(this.registerDate));		
//		System.out.println("Ngay het han: " + "\t" + format.format(this.expirationDate));
		System.out.println(toString());
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "User [username=" + username + ", userId=" + userId + ", fullName=" + fullName + ", birth=" + format.format(birth)
				+ ", phone=" + phone + ", email=" + email + ", registerDate=" + format.format(registerDate) + ", expirationDate="
				+ format.format(expirationDate) + "]";
	}
	
	
}
