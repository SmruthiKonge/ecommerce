package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;
import com.niit.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public Product getProductById(int id){
		return productDAO.getProductById(id);
	}
	
	public List<Product> getProductList(){
		return productDAO.getProductList();
			
	}
	
	public void addProduct(Product product){
		productDAO.addProduct(product);
	}
	
	public void editProduct(Product product){
		productDAO.editProduct(product);
	}
	
	public void deleteProduct(Product product){
		productDAO.deleteProduct(product);
	}
}
		
	
