package demo.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.entities.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
