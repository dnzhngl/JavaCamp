package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// Business Rules
		if(product.getCategoryId()== 1) {
			System.out.println("You can not add any product in this category..");
			return;
		}
		this.productDao.add(product);
		this.loggerService.log("Product addition has been done : " + product.getName());
	}

	@Override
	public void delete(Product product) {
		this.productDao.delete(product);
	}

	@Override
	public void update(Product product) {
		this.productDao.update(product);	
	}

	@Override
	public Product getById(int id) {
		this.productDao.getById(id);
		return null;
	}

	@Override
	public List<Product> getAll() {
		this.productDao.getAll();
		return null;
	}

}
