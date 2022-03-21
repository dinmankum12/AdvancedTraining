package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;

import com.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductDAO productDAO;
	
	
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	@Transactional
	public void addProduct(Product p) {
		this.productDAO.addProduct(p);
		
	}
	@Transactional
	public void updateProduct(Product p) {
		this.productDAO.updateProduct(p);
		
	}
	@Transactional
	public List<Product> listProducts() {
		return this.productDAO.listProducts();
		
	}
	@Transactional
	public Product getProductById(int pid) {
		return this.productDAO.getProductById(pid);
	}
	@Transactional
	public void removeProduct(int pid) {
		this.productDAO.removeProduct(pid);
		
	}





}
