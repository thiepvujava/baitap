package com.codeanhcuong.laptop;

public abstract class Laptop {

	private String name;
	private String origin;
	private int cost;
	
	public Laptop(String name, String origin, int cost) {
this.name = name;
this.origin = origin;
this.cost = cost;
		
	}
	
	public void information() {
		System.out.println("Name: " + name);
		System.out.println("Origin: " + origin);
		System.out.println("Cost: " + cost);
		System.out.println();
	}
	
	public void information(int batteryTime) {
		System.out.println("Battery is off after: " + batteryTime);
		System.out.println();
	}
	
	public void design() {
		System.out.println("good");
		System.out.println();
	}
	
}
