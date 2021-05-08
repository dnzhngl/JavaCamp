package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

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
	public List<Product> getAll() {
		return productDao.findAll();
	}

}
