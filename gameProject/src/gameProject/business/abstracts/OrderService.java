package gameProject.business.abstracts;

import gameProject.entities.Order;
import gameProject.entities.Product;
import gameProject.entities.User;

public interface OrderService {
	void add(User user, Product game, Order order);
	void delete(Order order);
}
