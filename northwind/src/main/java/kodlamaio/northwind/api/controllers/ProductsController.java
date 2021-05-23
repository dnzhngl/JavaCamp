package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

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
}
// kodlama.io/api/products/getall