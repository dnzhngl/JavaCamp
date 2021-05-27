package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data // Lombok, @Data -getter setter oluşturur.
@AllArgsConstructor // Parametreli constructor
@NoArgsConstructor // Parametresiz constructor
@Entity  // Bu classın bir veritabanı nesnesi olduğunu belirtir.
@Table(name="products")  // Veri tabanında hangi tabloya denk geldiği verilir.
public class Product {
	
	@Id	// Id alanı olduğu belirtirilir.Bu sayede JPA ya ve Hibernate bu tablonun Id'sini belirtiyoruz.
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Id değeri database'de birer birer artılırı belirtir.
	@Column(name="product_id") // Tabloda denk geldiği kolon adı verilir. 
	private int id;
	
	// ManyToOne ile Category ilişkisini kurduğumuz için ayrıca category_id alanını belirtmemize gerek yoktur.
	// @Column(name="category_id")
	// private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
//	public Product() {}
//	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
//			String quantityPerUnit) {
//		super();
//		this.id = id;
//		this.categoryId = categoryId;
//		this.productName = productName;
//		this.unitPrice = unitPrice;
//		this.unitsInStock = unitsInStock;
//		this.quantityPerUnit = quantityPerUnit;
//	}

// Lombok - Default constructor oluşturur. Ancak paramereleri constructor oluşturulduğunda, default constructor'ı ezer. O yüzden hem default hemde parametreli constructor oluşturulmalıdır.
// Lombok getter ve setter'ların arka planda oluşturulmasını sağlar.
	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getCategoryId() {
//		return categoryId;
//	}
//
//	public void setCategoryId(int categoryId) {
//		this.categoryId = categoryId;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public double getUnitPrice() {
//		return unitPrice;
//	}
//
//	public void setUnitPrice(double unitPrice) {
//		this.unitPrice = unitPrice;
//	}
//
//	public short getUnitsInStock() {
//		return unitsInStock;
//	}
//
//	public void setUnitsInStock(short unitsInStock) {
//		this.unitsInStock = unitsInStock;
//	}
//
//	public String getQuantityPerUnit() {
//		return quantityPerUnit;
//	}
//
//	public void setQuantityPerUnit(String quantityPerUnit) {
//		this.quantityPerUnit = quantityPerUnit;
//	}
}
