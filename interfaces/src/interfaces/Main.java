package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = {new EmailLogger(), new SmsLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer customer1 = new Customer(1,"Ahmet", "Tas");
		
		customerManager.add(customer1);

	}

}
