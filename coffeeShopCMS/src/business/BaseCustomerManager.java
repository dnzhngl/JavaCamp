package business;

import entities.Customer;

public abstract class BaseCustomerManager  implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("The customer " + customer.getFirstname() + " " +customer.getLastname() + " has been saved.");
	}

}
