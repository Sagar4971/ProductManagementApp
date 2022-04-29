package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.model.Admin;
import com.BikkadIT.model.Customer;
import com.BikkadIT.model.Product;

public interface ServiceI {
	
	public boolean saveAdmin(Admin admin);
	
	public List<Admin> loginCheckService(Admin admin);
	
	public List<Admin> ByUsernameAndPassword(String username,String password);
	
	public Product addProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public boolean saveCustomer(Customer customer);
	
	public Product getSingleProduct();

}
