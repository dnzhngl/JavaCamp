package gameProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import gameProject.dataAccess.abstracts.ProductDao;
import gameProject.entities.Product;

public class InMemoryProductDao implements ProductDao {

	private List<Product> productList;
	public InMemoryProductDao() {
		this.productList = new ArrayList<Product>();
	}
	
	@Override
	public void add(Product product) {
		this.productList.add(product);
		System.out.println("The " + product.getName() +" has been added.");
	}

	@Override
	public void delete(Product product) {
		this.productList.remove(product);
		System.out.println("The " + product.getName() +" has been deleted.");		
	}

	@Override
	public Product getById(int id) {
		return this.productList.stream().filter(p -> p.getId() == id).collect(Collectors.toList()).get(0);
	}

}
