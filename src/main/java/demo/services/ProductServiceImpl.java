package demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.entities.Product;
import demo.repositories.ProductRepository;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

}
