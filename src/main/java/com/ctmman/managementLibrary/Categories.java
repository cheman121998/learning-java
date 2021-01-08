package com.ctmman.managementLibrary;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Categories implements Serializable {
	public String id;
	public String name;
	public String description;
	
	public Categories(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public void input() {
		
	}
	public void display() {
		System.out.println("Ma the loai sach: " + "\t" + this.id);
		System.out.println("Ten the loai sach: " + "\t" + this.name);
		System.out.println("Mo ta sach:" + "\t" + this.description);
	}
}
