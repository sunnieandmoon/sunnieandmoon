package com.cart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.cart.model.Products;

@Service
public interface ProService {
	List<Products> addProductbyProductId(String category_id, String name,double price) throws Exception;
	
	List<Products> getProductById(long productId);
	
	List<Products> getAllProduct();
}
