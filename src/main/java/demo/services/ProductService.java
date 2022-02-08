package demo.services;

import demo.entities.Product;

public interface ProductService {
	
	public Iterable<Product> findAll();

}
