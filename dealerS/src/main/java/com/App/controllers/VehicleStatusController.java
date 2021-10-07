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

import com.App.models.VehicleStatus;
import com.App.services.VehicleStatusService;

@Controller
public class VehicleStatusController {

	@Autowired private VehicleStatusService vehicleStatusService;
	
	@GetMapping("/vehiclestatus")
	public String findAll(Model model) {
		
		model.addAttribute("vehiclestatus", vehicleStatusService.findAll());	
		
		
		return "VehicleStatus";
	}
	
	@RequestMapping("vehiclestatus/findById")
	@ResponseBody
	public Optional<VehicleStatus> findById(Integer id){
		return vehicleStatusService.findById(id);
	}
	
	@PostMapping("/vehiclestatus/addNew")
	public String addNew(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehiclestatus";
	}
	
	@RequestMapping(value="vehiclestatus/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehiclestatus";
	}
	
	@RequestMapping(value="vehiclestatus/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleStatusService.delete(id);
		return "redirect:/vehiclestatus";
	}

}
