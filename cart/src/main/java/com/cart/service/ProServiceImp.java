package com.cart.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.Repository.ProductRepo;
import com.cart.model.Products;

@Service
public class ProServiceImp implements ProService {
	
	@Autowired
	ProductRepo productRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(ProServiceImp.class);

	@Override
	public List<Products> addProductbyProductId(String category_id, String name, double price) throws Exception {
		try {
//			if(productRepo.getProductById().isPresent()){
//				throw new Exception("Product is already exist.");
//			}
			Products pro = new Products();
			pro.setName(name); 
			pro.setCategory_id(category_id);
			productRepo.save(pro);		
//			return this.getProductById(productId);
			return null;
//			return this.productRepo.findAll();
		}catch(Exception e) {
			e.printStackTrace();
			logger.error(""+e.getMessage());
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	public List<Products> getProductById(long productId) {
		return productRepo.getProductById(productId);
	}

	@Override
	public List<Products> getAllProduct() {
		return productRepo.getAllProduct();
	}

	

}
