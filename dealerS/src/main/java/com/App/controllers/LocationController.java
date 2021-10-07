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

import com.App.models.Location;
import com.App.models.State;
import com.App.services.CountryService;
import com.App.services.LocationService;
import com.App.services.StateService;

@Controller
public class LocationController {

	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/locations")
	public String findAll(Model model) {
		
		model.addAttribute("states", stateService.findAll());	
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("locations", locationService.findAll());
		
		return "Location";
	}
	
	@RequestMapping("locations/findById")
	@ResponseBody
	public Optional<Location> findById(Integer id){
		return locationService.findById(id);
	}
	
	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	
	@RequestMapping(value="locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	
	@RequestMapping(value="locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/locations";
	}

}
