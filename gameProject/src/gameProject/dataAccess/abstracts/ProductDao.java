package gameProject.dataAccess.abstracts;

import gameProject.entities.Product;

public interface ProductDao {
	void add(Product product);
	void delete(Product product);
	Product getById(int id);
}
