package gameProject;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import gameProject.business.concretes.CampaignManager;
import gameProject.business.concretes.OrderManager;
import gameProject.business.concretes.ProductManager;
import gameProject.business.concretes.UserManager;
import gameProject.dataAccess.concretes.InMemoryProductDao;
import gameProject.entities.Campaign;
import gameProject.entities.Order;
import gameProject.entities.Product;
import gameProject.entities.User;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "CryoFall", 100, "MMO");
		User user1 = new User (1, "123456789101","Ahmet","Tas","ahmetTas@abc.com","12345", new GregorianCalendar(1990,11,10).getTime());
		Order order1 = new Order(1, 1, 1, 10, 1);
		Campaign campaign1 = new Campaign(1, "Semester Holiday", 10, LocalDate.of(2021,05,05), LocalDate.of(2021,05, 25));
		
		UserManager userManager = new UserManager();
		userManager.register(user1);
		
		ProductManager productManager = new ProductManager(new InMemoryProductDao());
		productManager.add(product1);
		List<Product> productList = Stream.of(product1).collect(Collectors.toList());
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.applyCampaign(campaign1, productList);
		Product orderedProduct = productManager.getById(1);
		System.out.println(orderedProduct.getPrice());
		
		OrderManager orderManager = new OrderManager();
		orderManager.add(user1, orderedProduct, order1);
	}

}
