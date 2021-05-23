package kodlamaio.northwind.core.utilities.results;


public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	public Result(boolean success, String message) {
		this(success); // bu class içerisindeki tek paramtereli construtor'ı çalıştırır. -->for dry principle 
		this.message = message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
}
