package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		// ToDo: Will be refactored with Spring IoC
		// ProductService productService = new ProductManager(new HibernateProductDaoi());
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter(new JLoggerManager()));
		
		Product product1 = new Product(1, 2,  "Water",1.5,150);
		productService.add(product1);
	}

}
