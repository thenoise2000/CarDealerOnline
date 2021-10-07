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

import com.App.models.VehicleModel;
import com.App.services.StateService;
import com.App.services.VehicleModelService;

@Controller
public class VehicleModelController {

	@Autowired private VehicleModelService vehicleModelService;	
	
	
	@GetMapping("/vehiclemodels")
	public String findAll(Model model) {
		
		model.addAttribute("vehiclemodels", vehicleModelService.findAll());			
		
		return "vehicleModel";
	}
	
	@RequestMapping("vehiclemodels/findById")
	@ResponseBody
	public Optional<VehicleModel> findById(Integer id){
		return vehicleModelService.findById(id);
	}
	
	@PostMapping("/vehiclemodels/addNew")
	public String addNew(VehicleModel vehicleModel) {
		vehicleModelService.save(vehicleModel);
		return "redirect:/vehiclemodels";
	}
	
	@RequestMapping(value="vehiclemodels/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleModel vehicleModel) {
		vehicleModelService.save(vehicleModel);
		return "redirect:/vehiclemodels";
	}
	
	@RequestMapping(value="vehiclemodels/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleModelService.delete(id);
		return "redirect:/vehiclemodels";
	}

}
