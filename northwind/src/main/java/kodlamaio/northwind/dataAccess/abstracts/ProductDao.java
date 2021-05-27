package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

// JpaRespository<Entity Tipi, Id alanı veri tipi> : JpaRepository, verdiğin veri tipi yani @Entity annotation ile işaretlenmiş nesneyi ve o nesnenin primary key'sinin veri tipini ister. Böylelikle o nesneye özel bütün CRUD işlemlerinin oluşmasını sağlar. 
// C#'da yapmış olduğumuz EfBaseRepository'ye karşılık gelir.

public interface ProductDao extends JpaRepository<Product, Integer>{
	Product getByProductName(String productName);
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);	// select * from products where category_id in(1,2,3,4)
	List<Product> getByProductNameContains(String productName);
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("from Product where productName=:productName and category.categoryId=:categoryId") // Database tablo isimleri ile değil, entity classlarının isimleri ile çalışılır. parametre değerini okumak için : kullanılır.
	List<Product> getByNameAndCategory(String productName,int categoryId); // select * from products where product_name=bisey and category_id=bisey
}
