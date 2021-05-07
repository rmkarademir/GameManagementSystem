package Entities;

import Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private String developer;
	private double price;
	
	public Game() {
		
	}
	
	public Game(int id, String name, String developer, double price) {

		this.id = id;
		this.name = name;
		this.developer = developer;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
