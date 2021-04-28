package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V15", 6299,"IIL Intel Core i3 1005G1 8GB 256GB SSD Windows 10 Home", 10);	
		
		Product product2 = new Product();	// Instance creation - reference creation
		product2.setId(2);
		product2.setName("Lenovo V14");
		product2.setUnitPrice(5499);
		product2.setDetail("IGL Intel Celeron N4020 8GB 256GB SSD Windows 10 Home");
		product2.setDiscount(10);
				
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
		Product[] products = {product1, product2};
		System.out.println(products.length);
		
		for(Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println("Price after discount : " + product.getUnitPriceAfterDiscount());
		}
		
		
		// Category Operations
		
		Category category1 =  new Category();
		category1.setId(1);
		category1.setName("Laptop");
		
		Category category2 =  new Category();
		category2.setId(2);
		category2.setName("Home/Garden");


		
	}
}
