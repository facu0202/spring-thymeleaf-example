package com.facundo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facundo.service.MessagesService;

@Controller
public class ExampleController {

	@Autowired
	MessagesService messagesService; 
	
    @RequestMapping("/")
    String index(){
        return "index";
    }
    
    @RequestMapping("/list")
    String list(Model model){
    	
    	model.addAttribute("messages", messagesService.findAll());
    	return "list";
    }

}
