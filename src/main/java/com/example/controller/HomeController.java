package com.example.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	    @RequestMapping("/")
	    public String home() {
	        return "Home";
	    }
	    
	    
	    @RequestMapping("mentions")
	    public String mentions() {
	        return "mentions";
	    }
	 
	          
	    @RequestMapping("creation")
	    public String creation() {
	        return "creation";
	    }
	    
	    @RequestMapping("gifts/list")
	    public String gift() {
	        return "gifts/list";
	    }
	    
	    

}
