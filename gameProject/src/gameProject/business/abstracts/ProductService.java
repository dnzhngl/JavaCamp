package gameProject.business.abstracts;

import gameProject.entities.Product;

public interface ProductService {
	void add(Product game);
	void delete(Product game);
	Product getById(int id);
}
