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

import com.App.models.VehicleHire;
import com.App.services.ClientService;
import com.App.services.LocationService;
import com.App.services.VehicleHireService;
import com.App.services.VehicleService;



@Controller
public class VehicleHireController {

	@Autowired private VehicleHireService vehicleHireService;
	@Autowired private ClientService clientService;
	@Autowired private LocationService locationService;
	@Autowired private VehicleService vehicleService;

	
	@GetMapping("/vehiclehires")
	public String findAll(Model model) {
		
		model.addAttribute("vehiclehires", vehicleHireService.findAll());	
		model.addAttribute("clients", clientService.findAll());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());
		
		return "VehicleHire";
	}
	
	@RequestMapping("vehiclehires/findById")
	@ResponseBody
	public Optional<VehicleHire> findById(Integer id){
		return vehicleHireService.findById(id);
	}
	
	@PostMapping("/vehiclehires/addNew")
	public String addNew(VehicleHire vehicleHire) {
		vehicleHireService.save(vehicleHire);
		return "redirect:/vehiclehires";
	}
	
	@RequestMapping(value="vehiclehires/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleHire vehicleHire) {
		vehicleHireService.save(vehicleHire);
		return "redirect:/vehiclehires";
	}
	
	@RequestMapping(value="vehiclehires/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleHireService.delete(id);
		return "redirect:/vehiclehires";
	}

}
