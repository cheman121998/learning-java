package com.ctmman.training;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

public class App {
	public static void main1(String[] args) {
		List<String> listStr = new ArrayList<String>();
		Scanner  scanner = new Scanner(System.in);
		
		listStr.add("Che");
		listStr.add("Thi");
		listStr.add("Minh");
		listStr.add("Man");
		
		Iterator iterator = listStr.iterator();
		System.out.println("Hien thi phan tu su dung Iterator");
		while ((iterator).hasNext()) {
			System.out.println(iterator.hasNext());
		}
		
		
	}
	public static void main(String[] args) {
	    List<String> listString = new ArrayList<String>();
	    Scanner scanner = new Scanner(System.in);
	         
	    // thêm phần tử vào listString
	    listString.add("Monday");
	    listString.add("Tuesday");
	    listString.add("Wednesday");
	    listString.add("Thursday");
	    listString.add("Friday");
	    listString.add("Saturday");
	    listString.add("Sunday");
	         
	    // hiển thị các phần tử sử dụng Iterator
	    Iterator iterator = (Iterator) listString.iterator();
	         
	    System.out.println("Hiển thị phần tử sử dụng Iterator: ");
	    while ((iterator).hasNext()) {
	        System.out.println(iterator.next());
	    }
	         
	    // hiển thị các phần tử sử dụng ListIterator
	    ListIterator<String> listIterator = listString.listIterator();
	         
	    System.out.println("\nHiển thị phần tử sử dụng ListIterator: ");
	    while (listIterator.hasNext()) {
	        System.out.println(listIterator.next());
	    }
	         
	    System.out.println("\nHiển thị các phần tử của List theo thứ tự từ dưới lên: ");
	    while (listIterator.hasPrevious()) {
	        System.out.println(listIterator.previous());
	    }
	         
	    // thay đổi phần tử bất kỳ trong listString
	    System.out.println("\nNhập vào phần tử mới: ");
	    String element = scanner.nextLine();
	    System.out.println("Nhập vào giá trị của phần tử cần thay đổi: ");
	    int index = scanner.nextInt();
	    listString.set(index, element);
	         
	    System.out.println("Các phần tử có trong listString sau khi thay đổi: ");
	    for (String str : listString) {
	        System.out.println(str);
	    }
	         
	    // xóa phần tử vừa thay đổi trong listString
	    listString.remove(index);
	         
	    System.out.println("\nCác phần tử có trong listString sau khi xóa: ");
	    for (String str : listString) {
	        System.out.println(str);
	    }
	}
}
