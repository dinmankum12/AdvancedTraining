package com.service;

import java.util.List;


import com.model.Product;

public interface ProductService {

	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProducts();
	public Product getProductById(int pid);
	public void removeProduct(int pid);
	
}
