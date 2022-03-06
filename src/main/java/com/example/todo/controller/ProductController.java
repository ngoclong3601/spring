package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.todo.model.Product;

import com.example.todo.repository.ProductRepository;



@Controller
public class ProductController {
	
	@Autowired
	private  ProductRepository productRepository;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView getProduct() {
		ModelAndView mav = new ModelAndView("product");
		mav.addObject("list", productRepository.findAll());
		
		return mav;
       
    }
	 
	
	
}
