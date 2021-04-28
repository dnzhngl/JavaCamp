package oopIntro;

public class Product {
	
	//1. Fields
	
	// encapsulation
	
	// final : means that the field can be set just in the constructor.
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	// private double unitPriceAfterDiscount; - Since it is just a readable property there is no need to write it as a field. There is a getter for it to read.
	
	public Product() {
		
	}
	
	// 2. Constructors
	// Constructor - If there is more than one constructor, the one that matches the instance creation works.	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
	}

	// Operations
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Gets the value - Used for reading 
	public String getName() {
		return name;
	}
	// Sets the value - Used for writing
	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	// Getter for the unitPriceAfterDiscount : returns price after discount by using the values of the fields
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
		
}
