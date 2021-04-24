package oopIntro;

public class Product {
	int id;
	String name;
	double unitPrice;
	String detail;
	
	// Constructor - If there is more than one constructor, the one that matches the instance creation works.
	public Product() {
		System.out.println("Product constructor works");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this(); // Runs this class's constructor that has no parameter.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	
	
}
