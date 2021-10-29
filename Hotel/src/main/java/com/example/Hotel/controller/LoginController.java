package com.example.Hotel.controller;




import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Hotel.domain.Login;

import com.example.Hotel.service.LoginService;





@Controller
public class LoginController {
	
	@Autowired
    private LoginService userService;
	

	

                                   
    @GetMapping("/login")         
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }
    
    @GetMapping("/landpage")
    public String viewLandPage(Model model) {
        return "landpage";
    }
    

    
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String LoginUser(@ModelAttribute("user") Login std) {
    	userService.save(std);
        return "redirect:/login";
    }
    

    
    @GetMapping("/signup")
    public ModelAndView add(Model model) {
    	ModelAndView mav = new ModelAndView("signup");
        mav.addObject("user", new Login());
        return mav;
    }

    
    
    
    
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user ) {
    	
    	Login oauthUser = userService.login(user.getUsername(), user.getPassword());
    	

    	System.out.print(oauthUser);
    	if(Objects.nonNull(oauthUser)) 
    	{	
  
    		return "redirect:/landpage";
    	
    		
    	} else {
    		return "redirect:/login";
    		
    	
    	}

}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    	
	  
        return "redirect:/login";
    }

}