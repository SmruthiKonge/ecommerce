package com.niit.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerOrderDAO;
import com.niit.model.CustomerOrder;

@Repository
@Transactional
public class CustomerOrderDAOImpl implements CustomerOrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomerOrder(CustomerOrder customerorder){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customerorder);
		session.flush();
	}

}
