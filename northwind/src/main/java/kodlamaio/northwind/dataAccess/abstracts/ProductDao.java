package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.northwind.entities.concretes.Product;

// JpaRespository<Entity Tipi, Id alanı veri tipi> : JpaRepository, verdiğin veri tipi yani @Entity annotation ile işaretlenmiş nesneyi ve o nesnenin primary key'sinin veri tipini ister. Böylelikle o nesneye özel bütün CRUD işlemlerinin oluşmasını sağlar. 
// C#'da yapmış olduğumuz EfBaseRepository'ye karşılık gelir.

public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
