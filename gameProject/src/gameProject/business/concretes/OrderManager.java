package gameProject.business.concretes;

import gameProject.business.abstracts.OrderService;
import gameProject.entities.Order;
import gameProject.entities.Product;
import gameProject.entities.User;

public class OrderManager implements OrderService {

	@Override
	public void add(User user, Product game, Order order) {
		System.out.println("The order has been added." + 
							"\nUser : " + user.getEmail() +
							"\nPrice : " + order.getTotalPrice(game.getPrice()));
	}

	@Override
	public void delete(Order order) {
		System.out.println("The order has been deleted.");
	}

}
