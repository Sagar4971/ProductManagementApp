package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Admin;
import com.BikkadIT.model.Customer;
import com.BikkadIT.service.ServiceI;

@Controller
public class CustomerController {
	
	@Autowired
	private ServiceI serviceI;

	@GetMapping("/regCustomer")
	public String regCustomer() {
		return "CustomerReg";
		}
	
	@GetMapping("/saveCustomer")
	public String saveCustomers(Customer customer,Model model) {
		boolean savecust = serviceI.saveCustomer(customer);
		
		 if(savecust == false) {
			 return "regFail";
		 }
		
		return "customerSuccess";
		
	}
	
}
