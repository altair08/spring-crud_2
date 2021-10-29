package com.example.Hotel.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Hotel.domain.FoodOrder;
import com.example.Hotel.service.FoodOrderService;



@Controller
public class FoodOrderController {
	
	 @Autowired
	    private FoodOrderService service;

	    @GetMapping("/vieworder")
	    public String viewHomePage(Model model) {
	        List<FoodOrder> listfood = service.listAll();
	        model.addAttribute("listfood", listfood);
	       
	        return "vieworder";
	    }

	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("food", new FoodOrder());
	        model.addAttribute("pageTitle","Create New Order");
	        return "new";
	    }
	    
	 

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveFood(@ModelAttribute("food") FoodOrder std) {
	        service.save(std);
	        return "redirect:/landpage";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditFoodOrderPage(@PathVariable(name = "id") int id, Model model) {
	        ModelAndView mav = new ModelAndView("new");
	        FoodOrder std = service.get(id);
	        model.addAttribute("pageTitle","Edit Order");
	        mav.addObject("food", std);
	        
	        return mav;
	        
	       }
	    
	    @RequestMapping("/delete/{id}")
	    public String deleteFood(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/vieworder";
	    }
}