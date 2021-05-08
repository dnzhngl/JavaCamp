package gameProject.entities;

import java.time.LocalDate;

public class Campaign {
	private int id;
	private String name;
	private int discountRate;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Campaign(int id, String name, int discountRate, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.endDate = endDate;
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
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
