package com.BikkadIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Admin;
import com.BikkadIT.model.Customer;
import com.BikkadIT.model.Product;
import com.BikkadIT.repository.AdminRepository;
import com.BikkadIT.repository.CustomerRepository;
import com.BikkadIT.repository.ProductRepository;

@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public boolean saveAdmin(Admin admin) {
		Admin save = adminRepository.save(admin);
		
		 return save !=null && save.getAdminId() !=0;
		 }

	@Override
	public List<Admin> loginCheckService(Admin admin) {
		List<Admin> findAll = adminRepository.findAll();
		return findAll;
	}

	@Override
	public Product addProduct(Product product) {
		Product product2 = productRepository.save(product);
		return product2;

	//	return product2 !=null && product2.getProductId() !=0;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = productRepository.findAll();
		return list;
	}

	@Override
	public boolean saveCustomer(Customer customer) {
		Customer save1 = customerRepository.save(customer);
		return save1 !=null && save1.getCustomerId() !=0;
	}

	@Override
	public Product getSingleProduct() {
		Optional<Product> id = productRepository.findById(getClass());
		return id.get();
	}

	@Override
	public List<Admin> ByUsernameAndPassword(String username, String password) {
		List<Admin> list = adminRepository.findByUsernameAndPassword(username, password);
		return list;
	}

	
	

}
