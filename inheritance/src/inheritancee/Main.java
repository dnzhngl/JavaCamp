package inheritancee;

public class Main {

	public static void main(String[] args) {
		
		// Objects sent from front-end
		
		IndividualCustomer ic = new IndividualCustomer();
		ic.customerNumber="12345";
		
		CorporateCustomer cc = new CorporateCustomer();
		cc.customerNumber = "78945";
		
		TradeUnionCustomer tc  = new TradeUnionCustomer();
		tc.customerNumber = "32156";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		// Add multiple
		Customer[] customers = {ic, cc, tc};
		customerManager.addMultiple(customers);
		
		
		// Add one
		// customerManager.add(cc);
		// customerManager.add(ic);
		// customerManager.add(tc);
		
	}
}
