package com.cart.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.config.ApiResponse;
import com.cart.model.Products;
import com.cart.service.ProService;


@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	ProService proService;
	
	@GetMapping("getAll")
	public List<Products> getAllPRoducts(){
		return proService.getAllProduct();
	}
	
	
	
	@GetMapping("getproductById")
	public ResponseEntity<?> getProductById(@RequestBody HashMap<String,String> getCartRequest) {
		try {
			List<Products> obj = proService.getProductById(Long.parseLong(getCartRequest.get("productId")));
			return ResponseEntity.ok(obj);
		}catch(Exception e) {
				return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage(), ""));
		}	
   } 


	@PostMapping("addproduct")
	public ResponseEntity<?> addProduct(@RequestBody HashMap<String,String> addProductRequest) {
		try {
			String name = addProductRequest.get("name");
			String category_id = addProductRequest.get("category_id");
			double price = Double.parseDouble(addProductRequest.get("price"));
			List<Products> obj = proService.addProductbyProductId(category_id, name, price) ; 
			return ResponseEntity.ok(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage(), ""));
		}
		
   }
	
	
}
