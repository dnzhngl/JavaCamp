package gameProject.entities;

public class Order {
	private int id;
	private int userId;
	private int gameId;
	private int discount;
	private int count;
	
	public Order(int id, int userId, int gameId, int discount, int count) {
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.discount = discount;
		this.count = count;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getTotalPrice(double price) {
		return this.count * price - ( this.count * price * (this.discount != 0 ? (this.discount/100) : 1));
	}

}
