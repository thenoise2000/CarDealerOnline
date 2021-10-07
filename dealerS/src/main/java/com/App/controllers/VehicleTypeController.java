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

import com.App.models.State;
import com.App.models.VehicleType;
import com.App.services.CountryService;
import com.App.services.StateService;
import com.App.services.VehicleTypeService;

@Controller
public class VehicleTypeController {

	@Autowired private VehicleTypeService vehicleTypeService;
	
	@GetMapping("/vehicletypes")
	public String findAll(Model model) {
		
		model.addAttribute("vehicletypes", vehicleTypeService.findAll());			
		
		return "vehicleType";
	}
	
	@RequestMapping("vehicletypes/findById")
	@ResponseBody
	public Optional<VehicleType> findById(Integer id){
		return vehicleTypeService.findById(id);
	}
	
	@PostMapping("/vehicletypes/addNew")
	public String addNew(VehicleType vehicleType) {
		vehicleTypeService.save(vehicleType);
		return "redirect:/vehicletypes";
	}
	
	@RequestMapping(value="vehicletypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleType vehicleType) {
		vehicleTypeService.save(vehicleType);
		return "redirect:/vehicletypes";
	}
	
	@RequestMapping(value="vehicletypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleTypeService.delete(id);
		return "redirect:/vehicletypes";
	}
}
