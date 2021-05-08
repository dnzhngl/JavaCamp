package gameProject.business.concretes;

import gameProject.business.abstracts.ProductService;
import gameProject.dataAccess.abstracts.ProductDao;
import gameProject.entities.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		productDao.add(product);	
	}

	@Override
	public void delete(Product product) {
		productDao.delete(product);	
	}

	@Override
	public Product getById(int id) { 
		return this.productDao.getById(id);
	}
	
	
}
