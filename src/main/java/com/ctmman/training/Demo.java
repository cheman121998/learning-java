package com.ctmman.training;

public class Demo {

	public static void main(String[] args) {
		Book smartBook = new Book("Study", "hoc1");
		String english = smartBook.key;
		String vn = smartBook.value;
		System.out.println(english + " : " + vn);
	}

}
class Book extends Dictionary<String, String>{
	public Book(String key, String value){
		super(key, value);
	}
}
