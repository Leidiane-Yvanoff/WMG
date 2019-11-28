package com.example.controller;


  import javax.validation.Valid;
  
  import org.springframework.stereotype.Controller; 
  import org.springframework.ui.Model; 
  import org.springframework.validation.BindingResult; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import org.springframework.web.bind.annotation.PostMapping;

import entity.Gift; 
  
  
  @Controller 
  public class GiftController {
  
  
  @GetMapping("/gifts/list") 
  public String index(Model model) { 
	  Gift gift = new Gift(); 
	  model.addAttribute("gift", gift); 
	  return "gift_form"; 
	  }
  
  @PostMapping("/gifts/list") 
  public String handleGift(@Valid Gift gift, BindingResult bindingResult, Model model) { 
	  if(bindingResult.hasErrors()) {
		  return "gift_form"; 
  } 
	  model.addAttribute("gift",gift); 
	  return "show_gifts";
  } 
}
  

  
 
	 
	 
   
