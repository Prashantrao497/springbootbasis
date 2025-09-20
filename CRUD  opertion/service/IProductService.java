package com.productapp.service;

import java.util.List;

import com.productapp.model.Product;

public interface IProductService {
	
	//inbuilt method
	
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int productId);
	List<Product> getAllProducts();
	Product getById(int productId);

}
