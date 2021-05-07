package Entities;

import Abstract.Entity;

public class Sale implements Entity {
	private int id;
	private int gameId;
	private int gamerId;
	private double afterDiscountPrice;
	
	public Sale() {
		
	}
	
	public Sale(int id, int gameId, int gamerId, double afterDiscountPrice) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gamerId = gamerId;
		this.afterDiscountPrice = afterDiscountPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public double getAfterDiscountPrice() {
		return afterDiscountPrice;
	}

	public void setAfterDiscountPrice(double afterDiscountPrice) {
		this.afterDiscountPrice = afterDiscountPrice;
	}
	
}
