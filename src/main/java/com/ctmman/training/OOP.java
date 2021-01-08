package com.ctmman.training;

public class OOP {
	public static void main(String[] args) {
		Animals animal = new Animals();
		Dogs Bu = new Dogs();
		animal.move();
		Bu.move();
		Bu.bark();
		
	}	
}
class Animals {
	 public void move() {
		 System.out.println("Animal can move");
	 }
}
class Dogs extends Animals{
	
	public void move() {
		super.move();
		System.out.println("Dog can run...");
	}	
	public void bark() {
		System.out.println("Dog can bark");
	}
}