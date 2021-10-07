package com.App.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.App.models.Country;
import com.App.services.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countrie")
	public String findAll(Model model) {
		
		model.addAttribute("countries", countryService.findAll());		
		
		return "country";
	}
	
	@RequestMapping("countrie/findById")
	@ResponseBody
	public Optional<Country> findById(Integer id){
		return countryService.findById(id);
	}
	
	@PostMapping("/countrie/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countrie";
	}
	
	@RequestMapping(value="countrie/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countrie";
	}
	
	@RequestMapping(value="countrie/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countrie";
	}

}
