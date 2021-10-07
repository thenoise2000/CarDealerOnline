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

import com.App.models.VehicleMovement;
import com.App.services.LocationService;
import com.App.services.VehicleMovementService;
import com.App.services.VehicleService;

@Controller
public class VehicleMovementController {

	@Autowired private VehicleMovementService vehicleMovementService;
	@Autowired private LocationService locationService;
	@Autowired private VehicleService vehicleService;

	
	@GetMapping("/vehiclemovements")
	public String findAll(Model model) {
		
		model.addAttribute("vehiclemovements", vehicleMovementService.findAll());	
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());
		
		return "VehicleMovement";
	}
	
	@RequestMapping("vehiclemovements/findById")
	@ResponseBody
	public Optional<VehicleMovement> findById(Integer id){
		return vehicleMovementService.findById(id);
	}
	
	@PostMapping("/vehiclemovements/addNew")
	public String addNew(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehiclemovements";
	}
	
	@RequestMapping(value="vehiclemovements/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehiclemovements";
	}
	
	@RequestMapping(value="vehiclemovements/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleMovementService.delete(id);
		return "redirect:/vehiclemovements";
	}

}
