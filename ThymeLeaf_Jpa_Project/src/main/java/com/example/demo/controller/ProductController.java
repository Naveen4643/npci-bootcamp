package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService proService;
	
	@GetMapping("/proList")
	public String displayProducts(Model model) {
		List<Product> pro = proService.findAll();
		model.addAttribute("PRODUCTS",pro);
		return "/productUI/products.html";
	}
	
	@GetMapping("/addPro")
	public String proForm(Model model) {
		Product pro=new Product();
		model.addAttribute("PRODUCTS",pro);
		return "productUI/ProductForm.html";
	}
	
	@PostMapping("/savePro")
	public String save(@ModelAttribute("PRODUCTS") Product p) {
		
		proService.save(p);

		return "redirect:/product/proList";
	}
	
	
	@GetMapping("updateform")
	public String UpdateProduct(@RequestParam(value="proid")Integer id, Model model) {
		Product pro = proService.findById(id);
		model.addAttribute("PRODUCTS",pro);
		
		return "productUI/ProductForm.html";
	}
	
	
	@GetMapping("deleteform")
	public String deleteById(@RequestParam(value="proid")Integer id) {
		proService.deleteById(id);
		
		return "redirect:/product/proList";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam(value="ProductName")String name, Model model) {
		List<Product> products= proService.findByName(name);
		model.addAttribute("PRODUCTS", products);
		 
		return "/productUI/products.html";
	}

	@GetMapping("/searchByCategory")
	public String searchbyCategory(@RequestParam(value="ProductCategory")Integer categoryId, Model model) {
		List<Product> products= proService.findByCategoryId(categoryId);
		model.addAttribute("PRODUCTS", products);
		 
		return "/productUI/products.html";
	}
}
