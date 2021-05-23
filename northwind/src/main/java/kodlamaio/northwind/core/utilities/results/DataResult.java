package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result{

	private T data;
	
	public DataResult(T data, boolean success, String message) {
		super(success, message); // super() : Base sınıfın construtorlarını çalıştırır.Super içinde base sınıfa ilgili parametreler gönderilir.
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); 
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

}
