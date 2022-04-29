package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Admin;
import com.BikkadIT.model.Product;
import com.BikkadIT.service.ServiceI;

@Controller
public class AdminController {
	
	@Autowired
	private ServiceI serviceI;
	
	@GetMapping("/welcomeEshop")
	public String welcomeEshop() {
		return "welcome";
		}

	@GetMapping("/reg")
	public String regAdmin() {
		return "Registration";
		}
	@GetMapping("/addProductPage")
	public String addProductPage() {
		return "addProduct";
		
	}
	
	@GetMapping("/saveAdmin")
	public String saveAdmin(Admin admin,Model model) {
		boolean saveAdmin = serviceI.saveAdmin(admin);
		
		 if(saveAdmin == false) {
			 return "regFail";
		 }
		
		return "adminShow";
		
	}
	@GetMapping("/showDisplay")
	public String loginCheckedAdmin(@ModelAttribute Admin admin,Model model) {
		System.out.println(admin);
		List<Admin> list = serviceI.loginCheckService(admin);
		model.addAttribute("data",list);
		
		if(list==null) {
			return "loginFail";
		}
		return "adminDisplay";
		}
	
	@GetMapping("/addProducts")
	public String addProducts(@ModelAttribute Product product,Model model) {
		Product addProduct = serviceI.addProduct(product);
		model.addAttribute("addProduct",addProduct);
		System.out.println(addProduct);
		return "AddSuccess";
		
	}
	@GetMapping("/viewProduct")
	public String getAllProducts(Model model) {
		List<Product> list = serviceI.getAllProduct();
		model.addAttribute("list",list);
		return "addProductSuccess";
		}
	
	@GetMapping("/getSingleProduct")
	public String getSingleProduct(Model model) {
	 Product singleProduct = serviceI.getSingleProduct();
		System.out.println(singleProduct);
		model.addAttribute("singleProduct",singleProduct);
		return "singleProduct";
		
	}
	@GetMapping("/findAdminLogin/{username}/{password}")
	public String findByUsernameAndPassword(@PathVariable String username,@PathVariable String password){
		List<Admin> list = serviceI.ByUsernameAndPassword(username, password);
		return "adminShow";
		
	}
}
