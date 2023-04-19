package joonho.submit09;

import java.util.ArrayList;

public class Coffee {
	private String name;
	private int price;
	
	
	public Coffee() {};
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	public ArrayList<String> Coffee(ArrayList<String> name ,int price ){
//		this.name = name.getPrice();
//	}
	
	
	
	@Override
	public String toString() {
		return "[" + name + ": " + price + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}
