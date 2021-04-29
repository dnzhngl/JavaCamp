package inheritancee;

public class CustomerManager {
	
	// polymorphism
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " has been added.");
	}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer: customers) {
			add(customer); // The add method over top
		}
	}
	
	// SOLID - Open Closed Principle
	
	
	//	public void add(IndividualCustomer customer) {
	//		System.out.println(customer.customerNumber + " has been added.");
	//	}
	//	public void add(CorporateCustomer customer) {
	//		System.out.println(customer.customerNumber + " has been added.");
	//	}
}
