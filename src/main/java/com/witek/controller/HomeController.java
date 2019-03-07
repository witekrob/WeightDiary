package com.witek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.witek.model.Weight;

@Controller
public class HomeController {

@GetMapping("/")
public String home (Model model) {
	model.addAttribute("Weight",new Weight());
	return "index";
}

	
}
