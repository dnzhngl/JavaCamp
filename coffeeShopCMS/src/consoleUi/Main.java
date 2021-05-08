package consoleUi;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import Adapters.MernisServiceAdapter;
import business.BaseCustomerManager;
import business.CustomerCheckManager;
import business.CustomerCheckService;
import business.NeroCustomerManager;
import business.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, 11111111111L, "Ahmet", "Taş", LocalDate.of(1990, 10, 10));
		
		// Nero - validation not implemented.
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer1);
		
		
		// BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
	}

}
