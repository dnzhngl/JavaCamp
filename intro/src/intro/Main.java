package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		
		// Data Types -  Currency Rates Example
		String internetBranchButton = "Internet Branch";
		double dolarYesterday = 8.15;
		double dolarToday = 8.14;
		int term = 36;
		boolean isDollarRateDropped = false;
		
		System.out.println("Welcome to the "+ internetBranchButton + "!");
		
		if (dolarToday < dolarYesterday) {
			System.out.println("Dollar rate dropped.");	// shortcut : sysout
		} else if(dolarToday > dolarYesterday) {	
			System.out.println("Dolar rate rose.");
		} else {
			System.out.println("Dollar rate remained the same");
		}
		
		
		// Arrays
		String[] credits = {"Quick Loan", "Retirement Loan","Mortgage Loan", "Farmer Loan", "Education Loan"};
		
		// ForEach - iterator
		for (String credit : credits) {
			System.out.println(credit);
		}
		
		// For - Counter driven loop
		for(int i = 0 ; i<credits.length; i++) {
			System.out.println(i+1 + ". " + credits[i]);
		}
		
		// Reference - Value Types
		// Value Type - int, float, double, boolean, byte, enum -> Stored on STACK
		int num1 = 10;
		int num2 = 20;
		num1 = num2;
		num2 = 100;
		System.out.println(num1);		
		
		// Reference Type - array, class, interface -> Stored on HEAP
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {10,20,30,40,50};
		numbers1 = numbers2;
		numbers2[0]= 100;
		System.out.println(numbers1[0]);
		
		// Java Garbage Collector 
		//! String = char[] -> It is a reference type but works like value type.
		String city1 = "New York";
		String city2 = "Los Angeles";
		city1 = city2;
		city2 = "Washington DC";
		System.out.println(city1);
	}

}


