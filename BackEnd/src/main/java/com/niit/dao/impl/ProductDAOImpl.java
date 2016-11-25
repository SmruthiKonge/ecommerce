package com.niit.dao.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;


@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO  {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Product getProductById(int id){
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product) session.get(Product.class,id);
		session.flush();
		
		return product;
	}
	
	public List<Product> getProductList(){
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("From Product");
		List<Product> productList=query.list();
		session.flush();
		
		return productList;
	}
	
	public void addProduct(Product product){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();
		
	}
	
	public void editProduct(Product product){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();
	}

	public void deleteProduct(Product product){
		Session session=sessionFactory.getCurrentSession();
		session.delete(product);
		session.flush();
	}
	
}
		
		
		