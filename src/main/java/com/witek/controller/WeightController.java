package com.witek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.witek.model.Weight;
import com.witek.repository.WeightRepo;

@Controller
public class WeightController {

	private WeightRepo repo;
@Autowired
public WeightController(WeightRepo r) {
	this.repo=r;
}
@PostMapping("/save")
public String saveWeight(@ModelAttribute Weight weight) {
	repo.save(weight);
	return "redirect:/";
}
@GetMapping("/show")
public String showWeight(Model model) {
List<Weight> weights = repo.findAll();
model.addAttribute("weights",weights);
return "showAll";
}
}
