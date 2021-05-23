package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import net.bytebuddy.asm.Advice.This;

@Service // Bu class projede servis görevi görecek bilgisini spring frameworke verir.
public class ProductManager implements ProductService {

	// Spring, generic olarak çalışır. 
	// ProductDao'ya implemente ettiğimiz JpaRepository içerisine verilen parametrelere göre arka planda verilen değerlere göre bir repository classı/instance'ı oluşturuyor. 
	// Javada Beans -> class anlamına gelir.
	private ProductDao productDao;
	
	@Autowired // C#'daki Autofac IoC'nin karşılığı springde budur. Arka planda ProductDao için oluşturulan Repository classı ile bağlantı sağlar.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>( this.productDao.findAll(), "Data listed.");
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("The product has been added.");
	}

}
