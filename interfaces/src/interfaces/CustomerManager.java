package interfaces;

public class CustomerManager {
	
	// Loosely - Tightly coupled (dependency)	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("The customer has been added." + customer.getFirstname() + " " + customer.getLastname());
	
		Utils.runLoggers(loggers, "The customer '" + customer.getFirstname() + " " + customer.getLastname() + "' has been logged.");
	}
	
	public void delete(Customer customer) {
		System.out.println("The customer has been deleted." + customer.getFirstname() + " " + customer.getLastname());
		Utils.runLoggers(loggers, "The customer '" + customer.getFirstname() + " " + customer.getLastname() + "' has been logged." );
	}
}
