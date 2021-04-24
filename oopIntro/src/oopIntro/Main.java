package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();	// Instance creation - reference creation
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 5.499;
		product1.detail = "IGL Intel Celeron N4020 8GB 256GB SSD Windows 10 Home";
		
		Product product2 = new Product(2, "Lenovo V15", 6.299,"IIL Intel Core i3 1005G1 8GB 256GB SSD Windows 10 Home");	
		
		Product product3 = new Product(3, "HP 15", 7.499, "Intel Core I5 10210U 4gb 256GB SSD Windows 10 Home");	
		
		Product[] products = {product1, product2, product3};
		System.out.println(products.length);
		
		for(Product product : products) {
			System.out.println(product.name);
			System.out.println(product.unitPrice);
		}
		
		Category category1 =  new Category();
		category1.id=1;
		category1.name="Laptop";
		
		Category category2 =  new Category();
		category2.id=2;
		category2.name="Home/Garden";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
	}
}
