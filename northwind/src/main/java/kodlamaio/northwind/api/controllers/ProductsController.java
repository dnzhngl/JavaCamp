package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController // Springe bu classın bir Controller olduğunu bildirir.
@RequestMapping("/api/products") // Url yolu 
public class ProductsController {
	
	private ProductService productService;	
	@Autowired	// Autowired, parametredeki referanst tipe karşılık gelebilecek olan classı projeyi tarayıp buluyor ve  newliyor.
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall") // Get Request
	public DataResult<List<Product>> getAll(){
		return productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) { // Gelen requestin body'sini almak için kullanılan notasyon RequestBody == Dotnet FromBody
		return productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){ // RequestParam : yapılan isteğin parametrelerine bak, o parametreyi oku.
		return productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameContains")
	public 	DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}

	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo-1, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
	@GetMapping("/getByNameAndCategoryId")
	public DataResult<List<Product>> getByNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}

	
	
}
// kodlama.io/api/products/getall