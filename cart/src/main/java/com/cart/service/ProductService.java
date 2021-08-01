package com.cart.service;

import java.util.List;

import com.cart.model.Products;


public interface ProductService {
	
	void saveProduct(Products products);
	List<Products> getAllProducts();
	List<Products> getProductsById(long productId);

}
