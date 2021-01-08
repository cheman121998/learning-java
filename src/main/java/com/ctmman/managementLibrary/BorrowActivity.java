package com.ctmman.managementLibrary;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowActivity implements Serializable {
	public Date actionTime;
	public String userId;
	public String bookId;

	public Activity activity;
	public BorrowActivity(String userId, String bookId, Date actionTime) {
		this.actionTime = actionTime;
		this.userId = userId;
		this.bookId = bookId;
	}

	public BorrowActivity(String userId2, String bookId2, Date time, Activity borrow) {
		// TODO Auto-generated constructor stub
		this.actionTime = time;
		this.userId = userId2;
		this.bookId = bookId2;
		this.activity = borrow;
	}


//	public void display() {
//		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//		System.out.println("Ngay muon: " + "\t" + format.format(this.actionTime));
//	}
}

enum Activity {
	BORROW, RETURN
}

