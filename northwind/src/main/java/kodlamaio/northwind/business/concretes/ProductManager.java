package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

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
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listed.");
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("The product has been added.");
	}


	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName));
	}


	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId));
	}


	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId));

	}


	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByCategory_CategoryIdIn(categories));
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName));
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName));
	}


	@Override
	public DataResult<List<Product>> getByNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId));
	}


	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo, pageSize); // Pagination ayarı oluşturulur.
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent()); // getContent, pageabledan dönen datayı liste olarak verir.
	}


	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "productName"); // Nasıl sıralanacak, Hangi alana göre sıralanacak?
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort), "Sıralı Listelendi.");
	}


	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return new SuccessDataResult<List<ProductWithCategoryDto>>(productDao.getProductWithCategoryDetails(),"Ürünler kategorileri ile beraber listelendi.");
	}

}
